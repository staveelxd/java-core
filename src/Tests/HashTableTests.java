package Tests;

import Algorithms.HashTableAlgorithms;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HashTableTests {
    @Test
    public void intersectionTest1() {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] res = HashTableAlgorithms.intersection(arr1, arr2);
        Arrays.sort(res);
        assertArrayEquals(new int[]{2}, res);
    }
    @Test
    public void intersectionTest2() {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};
        int[] res = HashTableAlgorithms.intersection(arr1, arr2);
        Arrays.sort(res);
        assertArrayEquals(new int[]{4, 9}, res);
    }

    @Test
    public void intersectionIItest1() {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] res = HashTableAlgorithms.intersectionII(arr1, arr2);
        Arrays.sort(res);
        assertArrayEquals(new int[]{2, 2}, res);
    }
    @Test
    public void intersectionIItest2() {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};
        int[] res = HashTableAlgorithms.intersectionII(arr1, arr2);
        Arrays.sort(res);
        assertArrayEquals(new int[]{4, 9}, res);
    }
}
