/*
 O Algoritmo repetidamente reordena diferentes pares de itens, separados por um salto, 
 que � calculado a cada passagem. M�todo semelhante ao Bubble Sort, por�m mais eficiente.
 */
class CombSort {
	// encontrar lacuna entre elementos
	int getNextGap(int gap) {
		// Encolher lacuna com fator encolhedor
		gap = (gap * 10) / 13;
		if (gap < 1)
			return 1;
		return gap;
	}

	public static void main(String args[]) {
		CombSort ob = new CombSort();
		int vetor[] = { 100, 15, 65, 65, 76, 3, 4, 6, 8, 89 };
		ob.sort(vetor);

		for (int i = 0; i < vetor.length; ++i)
			System.out.println(" " + vetor[i]);

	}

	void sort(int vetor[]) {
		int n = vetor.length;

		// inicializar lacuna
		int gap = n;

		// Inicializar troca como verdadeiro para se certificar de que
		// loop roda
		boolean swapped = true;

		// Continue rodando enquanto a lacuna � maior que 1 e durar
		// itera��o causou uma troca
		while (gap != 1 || swapped == true) {
			// Encontrar proxima lacuna
			gap = getNextGap(gap);

			// Inicializa��o trocada como falsa para que possamos
			// verifique se a troca aconteceu ou n�o
			swapped = false;

			// Compare todos os elementos com a lacuna atual
			for (int i = 0; i < n - gap; i++) {
				if (vetor[i] > vetor[i + gap]) {
					// Trocar vetor[i] e vetor[i+gap]
					int temp = vetor[i];
					vetor[i] = vetor[i + gap];
					vetor[i + gap] = temp;

					// Set swapped
					swapped = true;
				}
			}
		}
	}

}
