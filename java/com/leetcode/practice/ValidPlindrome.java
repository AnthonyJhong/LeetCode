package com.leetcode.practice;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/valid-palindrome/
public class ValidPlindrome {
    public static void main(String [] args){
        //System.out.println(isPalindrome());
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s){
        //regex to remove all special characters
        String replaced = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        Set<Character> charSet = new HashSet<>();

        for(int i = 0; i < replaced.length()/2; i++){
            charSet.add(replaced.charAt(i));
            if(!charSet.remove(replaced.charAt(replaced.length()-1-i)))
                return false;
        }
        return true;
    }
}
