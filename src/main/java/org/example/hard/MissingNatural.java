package org.example.hard;

import java.util.Set;
import java.util.TreeSet;

public class MissingNatural {
    //https://leetcode.com/problems/first-missing-positive/description/
    public static int firstMissingPositive(int[] nums) {
        final Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        int reference = 1;
        for (Integer i : set) {
            if (i != reference) {
                return reference;
            }
            reference++;
        }
        return reference;
    }
}
