package easy;


import org.example.easy.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    //https://leetcode.com/problems/two-sum/

    @Test
    public void testTwoSum1() {
        int[] input = new int[]{3, 2, 4};
        int[] expected = new int[]{1, 2};
        TwoSum twoSum = new TwoSum();
        int[] actual = twoSum.twoSum(input, 6);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSum2() {
        int[] input = new int[]{2, 7, 11, 15};
        int[] expected = new int[]{0, 1};
        TwoSum twoSum = new TwoSum();
        int[] actual = twoSum.twoSum(input, 9);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSum3() {
        int[] input = new int[]{3, 3};
        int[] expected = new int[]{0, 1};
        TwoSum twoSum = new TwoSum();
        int[] actual = twoSum.twoSum(input, 6);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSum4() {
        int[] input = new int[]{5, 75, 25};
        int[] expected = new int[]{1, 2};
        TwoSum twoSum = new TwoSum();
        int[] actual = twoSum.twoSum(input, 100);
        assertArrayEquals(expected, actual);
    }
}
