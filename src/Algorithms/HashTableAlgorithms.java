package Algorithms;
// ХЭШ-ТАБЛИЦЫ:
// Intersection of Two Arrays ✅
// Intersection of Two Arrays II ✅
// Two Sum ✅
// Isomorphic Strings
// Word Pattern
// Valid Sudoku
// Group Anagrams
// LRU Cache
// Top k Frequent Elements)

import java.util.*;

public class HashTableAlgorithms {

    /* Intersection of Two Arrays
    Найти пересечение двух отсортированных массивов, т.е. найти элементы,
    которые встречаются в обоих массивах (уникальные)
     */
    /* Каждому по указателю
    {2, 2, 5, 8, 14, 19, 29, 30}
    {-3, 0, 1, 2, 2, 2, 8, 19}
    -> {2, 2, 8, 19}
     */
    // Время: О(n+m), Память: O(n+m)
    public static int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int num: arr1) {
            set.add(num);
        }
        for (int num: arr2) {
            if(set.contains(num)) {
                res.add(num);
            }
        }
        int[] result= new int[res.size()];
        int i = 0;
        for(int num : res){
            result[i]=num;
            i++;
        }
        return result;
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
    // Время: O(n+m), Память: О(min(n, m))
    public static int[] intersectionII(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        // Считаем появления чисел в nums1
        for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Проходимся по nums2 и находим пересечение
        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                res.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    // Two Sum
    /*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.
    You can return the answer in any order.
     */
    // nums = [2,7,11,15], target = 9 -> {0, 1}
    // nums = [3,2,4], target = 6 -> {1, 2}
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }
}
