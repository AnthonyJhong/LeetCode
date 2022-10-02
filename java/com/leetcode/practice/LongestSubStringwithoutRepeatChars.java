package com.leetcode.practice;

import java.util.HashMap;
import java.util.Set;

public class LongestSubStringwithoutRepeatChars {
    public static void main(String [] args){
        System.out.println(lengthOfLongestSubstring("abcabcbb"));// result = 3
        System.out.println(lengthOfLongestSubstring("bbbbb")); //result = 1
        System.out.println(lengthOfLongestSubstring("pwwkew")); //result = 3
        System.out.println(lengthOfLongestSubstring("p")); //result = 1
        System.out.println(lengthOfLongestSubstring("")); //result = 0
        System.out.println(lengthOfLongestSubstring("aab")); //result = 2

    }

    //We can do this in O(n)
    //I am having trouble getting the time complexity of my solution going to get back to it
    public static int lengthOfLongestSubstring(String s) {
       HashMap<Character, Integer> subStr = new HashMap<>();
       int count = 0; //this always need to be the size of the map
       int largest = 0; //stores the length of the largest sub string
       int lastIndex = 0;
       String removal = "";

       for(int i = 0; i < s.length(); i++){
           if(!subStr.containsKey(s.charAt(i))) {
               subStr.put(s.charAt(i), i);
               count++;
           }
           else{//remove all pairs that have a value less than the current keys value, update the value of the current key
               lastIndex = subStr.get(s.charAt(i));
               for(Character key: subStr.keySet()){
                   if(subStr.get(key) < lastIndex)
                       removal = removal + key;
               }
               //needed this loop here because we could not concurrently modify the # elements in a hashmap while iterating over all keys
               for(int j = 0; j < removal.length(); j++){
                   subStr.remove(removal.charAt(j));
               }
               removal = "";
               subStr.replace(s.charAt(i), i);
               count = subStr.size();
           }
           largest = Math.max(count, largest);
       }
       return largest;
    }
}
