/*
 É de simples implementação, leitura e manutenção;
 */
/*
 Vantagens
* É o método a ser utilizado quando o arquivo está "quase" ordenado
* É um bom método quando se desejar adicionar poucos elementos em um arquivo já ordenado, pois seu custo é linear.
* O algoritmo de ordenação por inserção é estável.
Desvantagens
* Alto custo de movimentação de elementos no vetor.
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