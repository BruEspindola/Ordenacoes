/*
  � um algoritmo de ordena��o baseado em se passar sempre o menor valor do vetor para a primeira posi��o
   (ou o maior dependendo da ordem requerida), depois o de segundo menor valor para a segunda posi��o,
   e assim � feito sucessivamente com os {\displaystyle n-1}n-1 elementos restantes, at� os �ltimos dois elementos.
 */
/*
 Vantagens
* Ele � um algoritmo simples de ser implementado em compara��o aos demais.
* N�o necessita de um vetor auxiliar (in-place).
* Por n�o usar um vetor auxiliar para realizar a ordena��o, ele ocupa menos mem�ria.
* Ele � uns dos mais velozes na ordena��o de vetores de tamanhos pequenos.

desvantagens
* Ele � um dos mais lentos para vetores de tamanhos grandes.
* Ele n�o � est�vel.
* Ele faz sempre a mesma complexidade de compara��es, independentemente do vetor estar ordenado ou n�o.
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