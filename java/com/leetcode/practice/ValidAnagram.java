package com.leetcode.practice;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args){

        //System.out.println(isAnagram());
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    //we can do this in O(n)
    //solution is O(n) but uses a lot of memory and goes through both string twice
    //this solution works with non alpha characters
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!charMap.containsKey(s.charAt(i)))
                charMap.put(s.charAt(i), 1);
            else
                charMap.replace(s.charAt(i), charMap.get(s.charAt(i))+1);

            if(!charMap.containsKey(t.charAt(i)))
                charMap.put(t.charAt(i), -1);
            else
                charMap.replace(t.charAt(i), charMap.get(t.charAt(i))-1);
        }

        for(int i = 0; i < s.length(); i++){
            if(charMap.get(s.charAt(i)) != 0)
                return false;

            if(charMap.get(t.charAt(i)) != 0){
                return false;
            }
        }
        return true;
    }
}
