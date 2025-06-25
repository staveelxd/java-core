package Algorithms;

// БИНАРНЫЙ ПОИСК
// First Bad Version ✅
// Valid Perfect Square ✅
// Search Insert Position ✅
// Sqrt(x) ✅
// Search in Rotated Sorted Array
// Peak Index in a Mountain Array
// Find First and Last Position of Element
// Search a 2D Matrix I/II
public class BinarySearchAlgorithms {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cur = arr[mid];
            if (cur == target) {
                return mid;
            } else if (cur < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


}
