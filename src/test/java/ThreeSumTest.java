import org.example.ThreeSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {
    // https://leetcode.com/problems/3sum/description/
    ThreeSum threeSum = new ThreeSum();

    private void assertZeroSumsFor(String expectedArrayString, int[] array) {
        String result = threeSum.threeSum(array).toString();
        assertEquals(expectedArrayString, result);
    }

    @Test
    public void testSolution1() {
        assertZeroSumsFor("[[-1, -1, 2], [-1, 0, 1]]", new int[]{-1, 0, 1, 2, -1, -4});
    }

    @Test
    public void testSolution2() {
        assertZeroSumsFor("[]", new int[]{0, 1, 1});
    }

    @Test
    public void testSolution3() {
        assertZeroSumsFor("[[0, 0, 0]]", new int[]{0, 0, 0});
    }

    @Test
    public void testSolution4() {
        assertZeroSumsFor("[[-1, 0, 1]]", new int[]{-1, 0, 1});
    }

    @Test
    public void testSolution5() {
        assertZeroSumsFor("[]", new int[]{1, 2, -2, -1});
    }

    @Test
    public void testSolution6() {
        assertZeroSumsFor("[[-2, -1, 3], [-1, 0, 1], [-2, 0, 2]]", new int[]{3, 0, -2, -1, 1, 2});
    }

    @Test
    public void testSolution7() {
        String expected = "[" +
                "[-1, -1, 2], [-2, -1, 3], [-3, -1, 4], " +
                "[-3, 1, 2], [-4, 1, 3], [-1, 0, 1], " +
                "[-2, 0, 2], [-3, 0, 3], [-4, 0, 4]]";
        int[] array = new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        assertZeroSumsFor(expected, array);
    }
}
