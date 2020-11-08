/*
 � um algoritmo de ordena��o generalista, e faz parte da fam�lia de algoritmos de ordena��o por sele��o.
 O heapsort n�o � um algoritmo de ordena��o est�vel. Por�m, � poss�vel adaptar a estrutura a ser ordenada 
 de forma a tornar a ordena��o est�vel. Cada elemento da estrutura adaptada deve ficar no formato de um par 
 (elemento original, �ndice original).
  Assim, caso dois elementos sejam iguais, o desempate ocorrer� pelo �ndice na estrutura original.
 */

public class HeapSort {
	
	public static void main(String args[]) {

		int vetor[] = { 100, 15, 65, 65, 76, 3, 4, 6, 8, 89 };
		heapSort(vetor);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(" " + vetor[i]);
		}

	}


public static void heapSort(int[] vetor){
        int tamanho = vetor.length;
        int i = tamanho / 2, pai, filho, t;
        while (true){
            if (i > 0){
                i--; t = vetor[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {return;}
                t = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (vetor[filho + 1] > vetor[filho])) {filho++;}
                if (vetor[filho] > t){
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {break;}
            }
            vetor[pai] = t;
        }
}
}