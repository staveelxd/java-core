package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

// ДВОЙНЫЕ УКАЗАТЕЛИ:
// Remove Duplicates From Sorted Array ✅
// Merge Sorted Array ✅
// Intersection of Two Arrays ✅
// Intersection of Two Arrays II ✅
// Two SUM II ✅
// 3Sum
// 4Sum
// Sort Colors ✅
// Move Zeroes ✅
// Partition Labels ✅

public class TwoPointersAlgorithms {

    // Remove Duplicates From Sorted Array
    /*
    Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.
Then return the number of unique elements in nums.
     */
    public static int removeDuplicates(int[] nums) {
        int dups = 0;
        int curval = nums[0];
        int unique = 1;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == curval) {
                dups++;
            } else {
                curval = nums[i];
                unique++;
                nums[i - dups] = curval;
            }
        }
        return unique;
    }

    // Merge Sorted Array
    /*
    You are given two integer arrays nums1 and nums2,
sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     */
    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    /* Intersection of Two Arrays
    Найти пересечение двух отсортированных массивов, т.е. найти элементы,
    которые встречаются в обоих массивах (с дубликатами)
     */
    /* Каждому по указателю
    {2, 2, 5, 8, 14, 19, 29, 30}
    {-3, 0, 1, 2, 2, 2, 8, 19}
    -> {2, 2, 8, 19}
     */
    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        int first = 0, second = 0;
        while(first < arr1.length && second < arr2.length) {
            if(arr1[first] == arr2[second]) {
                res.add(arr1[first++]);
                second++;
            } else if (arr1[first] > arr2[second]) {
                second++;
            } else {
                first++;
            }
        }
        return res;
    }

    // Intersection of Two Arrays II
    /*
    Given two integer arrays nums1 and nums2,
    return an array of their intersection.
    Each element in the result must appear as many times
    as it shows in both arrays, and you may return the result in any order.
     */
    // nums1 = [1,2,2,1], nums2 = [2,2] -> {2, 2}
    // nums1 = [4,9,5], nums2 = [9,4,9,8,4] -> {4, 9} or {9, 4}
    // Время: O(nlogn + mlogm), Память: О(1), если не считать выходной список
    public static int[] intersectionII(int[] nums1, int[] nums2)
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while((p1 < nums1.length) &&(p2 < nums2.length))
        {
            if(nums1[p1]< nums2[p2])
            {
                p1++;
            }
            else if(nums1[p1] > nums2[p2])
            {
                p2++;
            }
            else
            {
                res.add(nums1[p1]);
                p1++;
                p2++;

            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }


    /*
    Дан отсортированный по неубыванию массив целых чисел, индекс элемента
    и целое число k. Вернуть в любом порядке k чисел из массива, которые
    являются ближайшими по значению к элементу a[index]
    Пример:
    {2, 3, 5, 7,}, index = 3, k = 2 -> {5,7}
    {4, 12, 15, 15, 24}, index = 1, k = 3 -> {12, 15, 15}
     */
    // Указатели с двух сторон
    public static List<Integer> find_k_closest(int[] arr, int index, int k) {
        List<Integer> res = new ArrayList<>();
        int l = index, r = l + 1;
        while (res.size() != k) {
            // corner case #1
            if(r >= arr.length) {
                res.add(arr[l--]);
                continue;
            }
            // corner case #2
            if (l < 0) {
                res.add(arr[r++]);
                continue;
            }
            // сравниваем разницу между соседними элементами и искомым числом
            if (abs(arr[l] - arr[index]) <= abs(arr[r] - arr[index])) {
                res.add(arr[l--]);
            } else {
                res.add(arr[r++]);
            }
        }
        return res;
    }

    /*
    Дан двоичный массив v, где каждый его элемент, либо 0, либо 1, и нужно
    удалить из него ровно один элемент.
    Требуется написать функцию, которая вернет размер наибольшего непустого подмассива
    в получившемся массива (после удаления одного элемента), содержащего только 1.
    Вернуть 0, если такого подмассива нет.
     */
    // Быстрый и медленный указатели
    public static int longestSubarray(int[] arr) {
        int cnt = (arr[0] == 0) ? 1 : 0;
        int r = 0, ans = 0;
        for (int l = 0; l < arr.length; l++) {
            while (r + l < arr.length && cnt + (arr[r+1] == 0 ? 1 : 0) < 2) {
                r++;
                cnt += arr[r] == 0 ? 1 : 0;
            }
            ans = Math.max(ans, r - l);
            cnt -= arr[l] == 0 ? 1 : 0;
        }
        return ans;
    }

    /*
    Дан массив целых чисел, отсортированный по неубыванию. Вернуть
    массив квадратов каждого числа, отсортированный по неубыванию.
    {-3, 2, 4} -> {4, 9, 16}
    {-4, -1, 0, 3, 10} -> {0, 1, 9, 16, 100}
     */
    // Указатели с двух сторон
    public static int[] sortedSquares(int[] arr) {
        int[] res = new int[arr.length];
        int l = 0, r = arr.length - 1;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[l]*arr[l] >= arr[r]*arr[r]) {
                res[i] = arr[l]*arr[l++];
            } else {
                res[i] = arr[r]*arr[r--];
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }


    /*
    Дан целочисленный массив, переместите все нули в его конец,
    сохраняя относительный порядок ненулевых элементов.
    Нужно сделать это in-place, не создавая копию массива.
     */
    //
    // {2, 0, 0, 9, 3, 0, 1} -> {2, 9, 3, 1, 0, 0, 0}
    // Быстрый и медленный указатель
    public static void shiftZeroes(int[] arr) {
        int fast = 0, slow = 0;
        while(slow < arr.length) {
            if (fast == arr.length) {
                arr[slow++] = 0;
                continue;
            }
            if (arr[fast] != 0) {
                arr[slow++] = arr[fast++];
            } else {
                fast++;
            }
        }
    }
}
