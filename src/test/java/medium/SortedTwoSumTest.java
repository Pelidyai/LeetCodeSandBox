package medium;

import org.example.medium.SortedTwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortedTwoSumTest {
    @Test
    public void testSortedTwoSum1() {
        int[] input = new int[]{2, 3, 4};
        int[] expected = new int[]{1, 3};
        SortedTwoSum twoSum = new SortedTwoSum();
        int[] actual = twoSum.twoSum(input, 6);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortedTwoSum2() {
        int[] input = new int[]{2, 7, 11, 15};
        int[] expected = new int[]{1, 2};
        SortedTwoSum twoSum = new SortedTwoSum();
        int[] actual = twoSum.twoSum(input, 9);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortedTwoSum3() {
        int[] input = new int[]{3, 3};
        int[] expected = new int[]{1, 2};
        SortedTwoSum twoSum = new SortedTwoSum();
        int[] actual = twoSum.twoSum(input, 6);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortedTwoSum4() {
        int[] input = new int[]{5, 25, 75};
        int[] expected = new int[]{2, 3};
        SortedTwoSum twoSum = new SortedTwoSum();
        int[] actual = twoSum.twoSum(input, 100);
        assertArrayEquals(expected, actual);
    }
}
