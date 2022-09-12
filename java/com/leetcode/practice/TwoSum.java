package com.leetcode.practice;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int arr[] = {3,2,4};
        printArr(twoSum(arr, 6));
    }
    public static int[] twoSum(int[] nums, int target) {
        //O(n^2)
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) {
                    int [] solution = {i, j};
                    return solution;
                }
            }
        }
        return null;
    }

    //we can optimize this better by putting the numbers in the map and checking in the same loop
    //this will cut the time in half
    public static int[] twoSumFast(int[] nums, int target){
        HashMap<Integer,Integer> sumMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            sumMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(sumMap.containsKey(target - nums[i]) && sumMap.get(target - nums[i]) != i){
                return new int[]{i, sumMap.get(target-nums[i])};
            }
        }
        return null;
    }
    public static void printArr(int [] arr){
        for(int i: arr)
            System.out.print(i + " ");
    }
}
