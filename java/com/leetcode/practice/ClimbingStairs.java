package com.leetcode.practice;

public class ClimbingStairs {
    public static void main(String [] args){
        for(int i = 0;i < 10; i++){
            System.out.println(climbingStairsDP(i));
        }
    }
    // After looking at the problem I saw a pattern that resembled fibonacci's sequence
    // recursion is too slow so will need to solve using DP
    public static int climbingStairs(int n){
        return fib(n);
    }
    public static int fib(int n){
        if(n <= 1)
            return 1;

        return fib(n-1) + fib(n-2);
    }

    public static int climbingStairsDP(int n){
        int current = 1;
        int prev = 1;
        int temp;
        for(int i = 1; i < n; i++){
            temp = current;
            current =current+prev;
            prev = temp;

        }
        return current;
    }
}
