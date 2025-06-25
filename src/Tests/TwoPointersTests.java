package Tests;

import Algorithms.HashTableAlgorithms;
import Algorithms.TwoPointersAlgorithms;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TwoPointersTests {
    @Test
    public void intersectionIItest1() {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] res = TwoPointersAlgorithms.intersectionII(arr1, arr2);
        Arrays.sort(res);
        assertArrayEquals(new int[]{2, 2}, res);
    }
    @Test
    public void intersectionIItest2() {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};
        int[] res = TwoPointersAlgorithms.intersectionII(arr1, arr2);
        Arrays.sort(res);
        assertArrayEquals(new int[]{4, 9}, res);
    }
}
