package Algorithms;

// АЛГОРИТМЫ СОРТИРОВКИ (квадратичные -> O(1) по памяти, логарифмические,
// работа с интервалами, сортировка событий)
public class SortAlgorithms {
    public static void quickSort(int[] arr, int left, int right) {
        if (arr.length == 0 || left >= right) return;
        // Выбор опорного элемента
        int pivotIdx = partition(arr, left, right);
        quickSort(arr, left, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, right);
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
