package org.example.easy;

import java.util.*;


public class TwoSum {
    //https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> numsIndexes = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!numsIndexes.containsKey(nums[i])){
                numsIndexes.put(nums[i], new ArrayList<>());
            }
            numsIndexes.get(nums[i]).add(i);
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int foundIdx = Arrays.binarySearch(nums, i, nums.length, target - nums[i]);
            if(foundIdx < 0){
                continue;
            }
            List<Integer> secondIndexes = numsIndexes.get(nums[foundIdx]);
            int secondIdx = -1;
            int firstIdx = numsIndexes.get(nums[i]).get(0);
            for(int idx: secondIndexes){
                if(idx != firstIdx){
                    secondIdx = idx;
                    break;
                }
            }
            if(secondIdx != -1) {
                if(firstIdx < secondIdx) {
                    return new int[]{firstIdx, secondIdx};
                } else{
                    return new int[]{secondIdx, firstIdx};
                }
            }
        }
        return new int[0];
    }
}
