package com.leetcode.practice;



//https://leetcode.com/problems/single-number/
// Linear run time and constant space
public class SingleNumber {
    public static void main(String [] args){
        System.out.println(findSingleNum(new int[] {1,2,3,1,2,3,4}));
        System.out.println(findSingleNum(new int[] {1,2,3,4,1,2,3,}));
        System.out.println(findSingleNum(new int[] {4,1,2,1,2}));
        System.out.println(findSingleNum(new int[] {4}));
    }

    // Here we can use XOR (exclusive or // ^) because if a number is ever XORed then it cancels out this is a bitwise
    // operation
    public static int findSingleNum(int [] nums){
        int finalNumber = 0;

        for(int i: nums)
            finalNumber ^= i;

        return finalNumber;
    }
}
