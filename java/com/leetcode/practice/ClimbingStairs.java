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
        int current = 1; //1,2,3,5,8
        int prev = 1;
        int temp;
        for(int i = 2; i <= n; i++){
            temp = current;
            current = current+prev; //now 3
            prev = temp; // prev = 2

        }
        return current;
    }
}
