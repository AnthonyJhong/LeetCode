package com.leetcode.practice;

import java.util.HashMap;

//https://leetcode.com/problems/longest-palindrome/
public class LongestPalindrome {
    public static void main(String[] args){
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));

    }
    //this can be done in O(N) using a hashset
    public static int longestPalindrome(String s){
        HashMap<Character, Integer> charSet = new HashMap<>();
        int longestPal = 0;
        //load each character into a hash set and keep track of the numebrs of time that letter is repeated in the string
        for(int i = 0; i < s.length(); i++){
            if(charSet.containsKey(s.charAt(i)))
                charSet.replace(s.charAt(i), charSet.get(s.charAt(i))+1);
            else
                charSet.put(s.charAt(i), 1);
        }
        //For each unique character look through and if they are even add that number to the if odd then substract 1 from that number
        for(Character key: charSet.keySet()){
            if(charSet.get(key) % 2 == 1)
                longestPal += charSet.get(key)-1;
            else
                longestPal += charSet.get(key);
        }
        //if the length of the string is longer than longest palindrome we can add a single char to the middle
        if(s.length() > longestPal)
            longestPal++;

        return longestPal;
    }
}
