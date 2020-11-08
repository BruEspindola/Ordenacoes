/*
 O algoritmo Quicksort resolve o problema de ordenar um sequ�ncia respeitando uma ordem definida. 
 Utilizando a abordagem Dividir para conquistar ele implementa uma solu��o, no caso m�dio, em O (n log n).
 */

/*
 Vantagens:
* Melhor op��o para ordenar vetores grandes
* Muito r�pido por que o la�o interno � simples
* Mem�ria auxiliar para a pilha de recurs�o � pequena
* Complexidade no caso m�dio � O(n lg(n))
 Desvantagens:
* N�o � est�vel (n�o conhecemos forma eficiente para tornar o quicksort est�vel)
* Pior caso � quadr�tico
 */
public class QuickSort {
	
	public static void main(String args[]) {

		int vetor[] = { 100, 15, 65, 65, 76, 3, 4, 6, 8, 89 };
		quickSort(vetor, 0, vetor.length - 1);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(" " + vetor[i]);
		}

	}

	public static void quickSort(int v[], int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		int pivo = v[(esq + dir) / 2];
		int troca;

		while (esq <= dir) {
			while (v[esq] < pivo) {
				esq = esq + 1;
			}
			while (v[dir] > pivo) {
				dir = dir - 1;
			}
			if (esq <= dir) {
				troca = v[esq];
				v[esq] = v[dir];
				v[dir] = troca;
				esq = esq + 1;
				dir = dir - 1;
			}
		}
		if (dir > esquerda)
			quickSort(v, esquerda, dir);

		if (esq < direita)
			quickSort(v, esq, direita);

	}

	
}