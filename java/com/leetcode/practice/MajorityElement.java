package com.leetcode.practice;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main (String [] args){
        System.out.println(majorityElement(new int[] {3,2,3}));
        System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums){
        Map<Integer, Integer> numNums = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!numNums.containsKey(nums[i]))
                numNums.put(nums[i], 1);
            else {
                numNums.put(nums[i], 1);
                if(numNums.get(nums[i]) >= nums.length/2)
                    return nums[i];
            }
        }

        int currentMost = -99;
        int mostNum = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(numNums.get(nums[i]) > currentMost){
                currentMost = numNums.get(nums[i]);
                mostNum = nums[i];
            }
        }
        return mostNum;
    }
}
