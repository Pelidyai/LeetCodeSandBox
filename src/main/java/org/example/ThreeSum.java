package org.example;

import java.util.*;

public class ThreeSum {
    // https://leetcode.com/problems/3sum/description/
    private static final int NEEDED_SUM = 0;
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Set<Integer>> valuesToId = new HashMap<>();
        for(int i = 0; i < nums.length - 1; i++) {
            if(!valuesToId.containsKey(nums[i])){
                valuesToId.put(nums[i], new HashSet<>());
            }
            valuesToId.get(nums[i]).add(i);
        }
        Set<List<Integer>> triplets = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int difference = NEEDED_SUM - nums[i] - nums[j];
                Set<Integer> ids = valuesToId.get(difference);
                if (ids == null ||
                        ids.size() == 1 && ids.contains(i) && !ids.contains(j)
                        || ids.size() == 1 && !ids.contains(i) && ids.contains(j)
                        || ids.size() == 2 && ids.contains(i) && ids.contains(j)) {
                    continue;
                }
                int[] mas = {nums[i], nums[j], difference};
                Arrays.sort(mas);
                triplets.add(List.of(mas[0], mas[1], mas[2]));
            }
        }
        return new ArrayList<>(triplets);
    }
}
