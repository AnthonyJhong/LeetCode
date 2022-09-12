package com.leetcode.practice;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String args[]){
        int array[] = {3,2,2,3};
        System.out.println(removeElement(array, 3));
        printArr(array);
    }
    //brute force I think that once we move one of the off numbers to the end we can substract one iteration from the loop
    // o(n) to figure out how many of the number there are
    // partition the sorting into two parts one that iterates over the portion of the
    public static int removeElement(int [] nums, int val){
        int count = 0;
        for(int i: nums){
            if(i == val)
                count++;
        }
        int secondPartitionIndex = nums.length - count;
        for(int i = 0; i < nums.length-count; i++){
            if(nums[i] == val){
                while(secondPartitionIndex < nums.length && nums[secondPartitionIndex] == val) {
                    secondPartitionIndex++;
                }
                swap(nums, i, secondPartitionIndex);
            }
        }

        return nums.length-count;
    }

    //I actually think that this is the same speed we are just doing unecessary swaps in our code
    public static int removeElementsFaster(int arr[], int val){
        int num = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=val)
                arr[num++] = arr[i];
        }

        return num;
    }

    public static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArr(int []arr){
        for(int i: arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
