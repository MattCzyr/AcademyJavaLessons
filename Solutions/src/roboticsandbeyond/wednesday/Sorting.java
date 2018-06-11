package roboticsandbeyond.wednesday;

public class Sorting {

	public static void main(String[] args) {
		int[] small_array = { 35, 4, 14, 19, 42, 6, 11, 25 };
		int[] medium_array = { 22, 16, 7, 13, 55, 24, 65, 91, 10, 44, 26, 33, 70, 16 };
		int[] large_array = { 10, 27, 6, 81, 60, 44, 2, 9, 50, 54, 12, 17, 20, 92, 66, 5, 14, 74, 13, 77, 34, 19, 15, 38 };

		// insertionSort
		System.out.println("Running insertionSort on small_array...");
		insertionSort(small_array);
		for (int i = 0; i < small_array.length; i++) {
			System.out.print(small_array[i] + " ");
		}
		System.out.print("\n");

		// bubbleSort
		System.out.println("Running bubbleSort on medium_array...");
		bubbleSort(medium_array);
		for (int i = 0; i < medium_array.length; i++) {
			System.out.print(medium_array[i] + " ");
		}
		System.out.print("\n");

		// quickSort
		System.out.println("Running quickSort on large_array...");
		quickSort(large_array);
		for (int i = 0; i < large_array.length; i++) {
			System.out.print(large_array[i] + " ");
		}
		System.out.print("\n");
	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return i + 1;
	}

	public static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int index = partition(array, low, high);
			quickSort(array, low, index - 1);
			quickSort(array, index + 1, high);
		}
	}

	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

}
