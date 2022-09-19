package com.leetcode.practice;
//https://leetcode.com/problems/binary-search/
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int [] {-1,0,3,5,9,12}, 9));
        System.out.println(search(new int [] {-1,0,3,5,9,12}, 2));
        System.out.println(search(new int [] {2,5}, 7));
    }

    //must be this is nlogn
    public static int searchNLogN(int[] nums, int target) {
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] == target)
                return i;

            if(nums[nums.length-1-i] == target)
                return nums.length-1-i;
        }

        if (nums.length % 1 == 1) {
            if (nums[nums.length + 1] == target)
                return nums.length + 1;
        }
        return -1;
    }

    //log(n) solution
    public static int search(int [] nums, int target){
        return helper(0, nums.length-1, nums, target);
    }

    public static int helper(int start, int end, int [] nums, int target){
        if(start == end && nums[start] != target)
            return -1;


        if(nums[(end+start)/2] > target) {
            System.out.println("here");
            printSubArray(start, (end+start)/2, nums);
             return helper(start, (end+start)/2, nums, target);
        }
        else if(nums[(end+start)/2] < target) {
            printSubArray((end+start)/2 +1, end, nums);
            return helper((end+start)/2 +1, end, nums, target);
        }
        else return (end+start) /2;

    }

    public static void printSubArray(int start, int end, int [] arr){
        for (int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}