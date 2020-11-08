/*
 é um algoritmo de ordenação extremamente ineficiente. É baseado na reordenação aleatória dos elementos.
  Não é utilizado na prática, mas pode ser usado no ensino de algorítmos mais eficientes.
 */
public class BogoSort {

	public static void main(String[] args) {
		int[] i =  { 100, 15, 65, 65, 76, 3, 4, 6, 8, 89 };
		new BogoSort(i);
	}

	public BogoSort(int[] i) {

		while (!isSorted(i)) {
			shuffle(i);

		}

		print(i);
	}

	private void print(int[] i) {
		for (int x : i) {
			System.out.println(" " + x);
		}
		System.out.println();
	}

	//embaralhar
	private void shuffle(int[] i) {
		for (int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length), index2 = (int) (Math.random() * i.length);
			int a = i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}

	private boolean isSorted(int[] i) {
		for (int x = 0; x < i.length - 1; ++x) {
			if (i[x] > i[x + 1]) {
				return false;
			}
		}
		return true;
	}

}