import java.util.Arrays;

public class SortingAlgorithms {

    // Bubble Sort: ikumpara ang duha ka magkatapad nga numero ug i-swap kung sayop ang han-ay
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // wala nay swap, sorted na
            }
        }
    }

    // Selection Sort: pangitaon ang pinakagamay ug ibutang sa sakto niyang posisyon
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort: kuhaon ang usa ka numero ug isulod sa sakto nga lugar sa sorted nga bahin
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] original = {64, 25, 12, 22, 11, 90, 5, 78, 33, 47};

        // Separate copy sa original array para sa matag algorithm
        int[] bubbleArr = Arrays.copyOf(original, original.length);
        int[] selectionArr = Arrays.copyOf(original, original.length);
        int[] insertionArr = Arrays.copyOf(original, original.length);

        System.out.println("Original Array:       " + Arrays.toString(original));
        System.out.println();

        bubbleSort(bubbleArr);
        System.out.println("Bubble Sort Result:    " + Arrays.toString(bubbleArr));

        selectionSort(selectionArr);
        System.out.println("Selection Sort Result: " + Arrays.toString(selectionArr));

        insertionSort(insertionArr);
        System.out.println("Insertion Sort Result: " + Arrays.toString(insertionArr));
    }
}
