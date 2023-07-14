package org.example.medium;

import java.util.*;

public class SortedTwoSum {
    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int secondIdx = Arrays.binarySearch(nums, i + 1, nums.length, target - nums[i]);
            if (secondIdx < 0) {
                continue;
            }
            if (i < secondIdx) {
                return new int[]{i + 1, secondIdx + 1};
            } else {
                return new int[]{secondIdx + 1, i + 1};
            }
        }
        return new int[0];
    }
}
