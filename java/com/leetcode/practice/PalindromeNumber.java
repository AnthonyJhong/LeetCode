package com.leetcode.practice;
import java.lang.Math.*;

public class PalindromeNumber {
    public static void main(String [] args){
        System.out.println(isPalindromeNoString(10));
        System.out.println(isPalindromeNoString(1234321));
        System.out.println(isPalindromeNoString(-1234321));
        System.out.println(isPalindromeNoString(111234321));
        System.out.println(isPalindromeNoString(1112343211));
    }
    public static boolean isPalindrome(int x){
        if(x < 0)
            return false;

        String stringified =  Integer.toString(x);
        int rearIndex = stringified.length() - 1;
        for(int i = 0; i < stringified.length()/2; i++){
            if(stringified.charAt(i) != stringified.charAt(rearIndex - i))
                return false;
        }
        return true;
    }
    public static boolean isPalindromeNoString(int x){
        if(x < 0)
            return false;
        int changingInput = x;
        int newInt = 0;

        while(changingInput != 0){
            newInt = newInt*10 + changingInput%10;
            changingInput/=10;
        }
        return newInt == x;
    }
}
