package org.example.hard;

public class MissingNatural {
    //https://leetcode.com/problems/first-missing-positive/description/
    public static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
        int res = 1;
        for (int num : nums) {
            if (num == res) {
                res++;
            }
        }
        return res;
    }
}
