package com.leetcode.practice;

import java.lang.Math;

//https://leetcode.com/problems/contains-duplicate-iii/submissions/
public class ContainsDuplicate3 {
    public static void main(String [] args){
        //System.out.println(containsNearbyAlmostDuplicate(new int [] {}, 0, 0));
        System.out.println(containsNearbyAlmostDuplicate(new int [] {1,2,3,4}, 3, 3));
        System.out.println(containsNearbyAlmostDuplicate(new int [] {1,5,9,1,5,9}, 2, 3));
    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff){
        int iterK = indexDiff;
        for(int i = 0; i < nums.length; i++){

            if(i + indexDiff > nums.length-1)
                iterK = nums.length-1 - i;
            else
                iterK = indexDiff;

            for(int j = 1; j <= iterK; j++){
                if(Math.abs(nums[i] - nums[i+j]) <= valueDiff)
                    return true;
            }
        }
        return false;
    }

}
