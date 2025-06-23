import Algorithms.DoublePointersAlgorithms;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class Tests {

    @Test
    public void test() {
        int[] arr = {2, 0, 0, 9, 3, 0, 1};
        DoublePointersAlgorithms.shiftZeroes(arr);
        assertArrayEquals(new int[]{2, 9, 3, 1, 0, 0, 0}, arr);
    }
}
