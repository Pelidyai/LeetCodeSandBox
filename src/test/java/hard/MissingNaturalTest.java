package hard;

import org.example.hard.MissingNatural;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNaturalTest {
    //https://leetcode.com/problems/first-missing-positive/description/

    @Test
    public void test1() {
        int i = MissingNatural.firstMissingPositive(new int[]{1});
        assertEquals(2, i);
    }

    @Test
    public void test2() {
        int i = MissingNatural.firstMissingPositive(new int[]{3, 4, -1, 1});
        assertEquals(2, i);
    }

    @Test
    public void test3() {
        int i = MissingNatural.firstMissingPositive(new int[]{7, 8, 9, 11, 12});
        assertEquals(1, i);
    }

    @Test
    public void test4() {
        int i = MissingNatural.firstMissingPositive(new int[]{1, 1000});
        assertEquals(2, i);
    }

    @Test
    public void test5() {
        int i = MissingNatural.firstMissingPositive(new int[]{1, 2, 6, 3, 5, 4});
        assertEquals(7, i);
    }

    @Test
    public void test6() {
        int i = MissingNatural.firstMissingPositive(new int[]{-1, 4, 2, 1, 9, 10});
        assertEquals(3, i);
    }
}
