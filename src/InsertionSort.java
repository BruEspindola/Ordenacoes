/*
 � de simples implementa��o, leitura e manuten��o;
 */
/*
 Vantagens
* � o m�todo a ser utilizado quando o arquivo est� "quase" ordenado
* � um bom m�todo quando se desejar adicionar poucos elementos em um arquivo j� ordenado, pois seu custo � linear.
* O algoritmo de ordena��o por inser��o � est�vel.
Desvantagens
* Alto custo de movimenta��o de elementos no vetor.
 */

public class InsertionSort {

	public static void main(String args[]) {

		int vetor[] = {100, 15, 65, 65, 76, 3, 4, 6, 8, 89 };
		insertionSort(vetor);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(" " + vetor[i]);
		}

	}

	public static void insertionSort(int[] vetor) {

		for (int i = 1; i < vetor.length; i++) {

			int aux = vetor[i];
			int j = i;

			while ((j > 0) && (vetor[j - 1] > aux)) {
				vetor[j] = vetor[j - 1];
				j -= 1;
			}
			vetor[j] = aux;

		}

	}
}