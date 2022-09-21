package com.leetcode.practice;

//https://leetcode.com/problems/maximum-subarray/
public class MaxSubArray {
    public static void main (String [] args){
        //System.out.println(maxSubArray(new int [] {}));
        System.out.println(maxSubArray(new int [] {-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int [] {1}));
        System.out.println(maxSubArray(new int [] {5,4,-1,7,8}));

    }

    //depth first search
    public static int maxSubArray(int [] nums){
        int accum = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            //if(the sub array + the new value is smaller than the new value just set new max to new value
            if(accum + nums[i] < nums[i])
                accum = nums[i];
            else
                accum += nums[i];

            if(accum > max)
                max = accum;
        }

        return max;
    }
}
