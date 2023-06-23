package easy;

import org.example.easy.PlusOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusOneTest {
    // https://leetcode.com/problems/plus-one/

    PlusOne plusOne = new PlusOne();

    private void assertPlusOne(int[] expected, int[] input) {
        int[] result = plusOne.plusOne(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testPlusOne1() {
        int[] input = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 4};
        assertPlusOne(expected, input);
    }

    @Test
    public void testPlusOne2() {
        int[] input = new int[]{4,3,2,1};
        int[] expected = new int[]{4,3,2,2};
        assertPlusOne(expected, input);
    }

    @Test
    public void testPlusOne3() {
        int[] input = new int[]{9};
        int[] expected = new int[]{1, 0};
        assertPlusOne(expected, input);
    }

    @Test
    public void testPlusOne4() {
        int[] input = new int[]{4, 9};
        int[] expected = new int[]{5, 0};
        assertPlusOne(expected, input);
    }

    @Test
    public void testPlusOne5() {
        int[] input = new int[]{9, 9, 9, 9};
        int[] expected = new int[]{1, 0, 0, 0, 0};
        assertPlusOne(expected, input);
    }
}
