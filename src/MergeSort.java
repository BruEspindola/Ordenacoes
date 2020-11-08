/*
 O merge sort, ou ordena��o por mistura, � um exemplo de algoritmo de ordena��o
  por compara��o do tipo dividir-para-conquistar.
  
  * Algoritmo Criado por Von Neumann em 1945.
Desvantagens
* Utiliza fun��es recursivas;
* Gasto extra de mem�ria.
 */

import java.util.Arrays;

public class MergeSort {
	
	 public static void main(String[]args){
	        int [] vetor = new int[]{ 100, 15, 65, 65, 76, 3, 4, 6, 8, 89 };
	        new MergeSort().sort(vetor,vetor.length);
	        System.out.println(Arrays.toString(vetor));
	    }
	 
    public void merge(int[]nums, int[]left, int[]right){

        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j])
                nums[k++] = left[i++];

            else nums[k++] = right[j++];
        }
        while(i<left.length)//copia os elementos restantes da parti��o esquerda
            nums[k++] = left[i++];

        while(j< right.length)//copie os elementos restantes da parti��o direita
            nums[k++] = right[j++];
    }

    public void sort(int[]nums, int len){

        if(len < 2)
            return;
        int mid = len/2;
        int [] esquerda = new int[mid];//cria parti��o esquerda
        int [] direita = new int[len - mid];//cria parti��o direita

        for(int i = 0; i < mid; i++)
            esquerda[i] = nums[i];

        for(int j = mid; j< len; j++)
            direita[j - mid] = nums[j];

        sort(esquerda,mid);
        sort(direita,len - mid);
        merge(nums,esquerda,direita);//mescla as duas parti��es classificadas
    }
   
}