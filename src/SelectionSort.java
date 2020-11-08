/*
  é um algoritmo de ordenação baseado em se passar sempre o menor valor do vetor para a primeira posição
   (ou o maior dependendo da ordem requerida), depois o de segundo menor valor para a segunda posição,
   e assim é feito sucessivamente com os {\displaystyle n-1}n-1 elementos restantes, até os últimos dois elementos.
 */
/*
 Vantagens
* Ele é um algoritmo simples de ser implementado em comparação aos demais.
* Não necessita de um vetor auxiliar (in-place).
* Por não usar um vetor auxiliar para realizar a ordenação, ele ocupa menos memória.
* Ele é uns dos mais velozes na ordenação de vetores de tamanhos pequenos.

desvantagens
* Ele é um dos mais lentos para vetores de tamanhos grandes.
* Ele não é estável.
* Ele faz sempre a mesma complexidade de comparações, independentemente do vetor estar ordenado ou não.
 */

public class SelectionSort {
    public static void main(String[] args) {
        
        int vetor[] = { 100, 15, 65, 65, 76, 3, 4, 6, 8, 89};
       
        int menor, indiceMenor;

        for (int i = 0; i < vetor.length - 1; i++) {
           
            menor = vetor[i];
            indiceMenor = i;

           
            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[j] < menor){
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }

            // troca os valores menor e maior
            vetor[indiceMenor] = vetor[i];
            vetor[i] = menor;
        }

       
       
        for (int n : vetor) {
        	System.out.println(" " + n);
        }
        
    }
}