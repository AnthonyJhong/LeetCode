
package com.leetcode.practice;

//https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {
    public static void main(String [] args){
        //System.out.println(isPowerOfTwo());
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(12334));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(1073741824));
        System.out.println(isPowerOfTwo(-1073741824));

    }

    public static boolean isPowerOfTwo(int n){
        if(n == 1 || n == -1)
            return true;
        else if(n%2 != 0)
            return false;
        return isPowerOfTwo(n/2);
    }
}
