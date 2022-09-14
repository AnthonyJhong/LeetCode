package com.leetcode.practice;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public static void main (String [] args){
        //System.out.println(new int[] {});
        System.out.println(containsDuplicate(new int[] {1,2,3,1})); //true
        System.out.println(containsDuplicate(new int[] {1,2,3,4})); //false
        System.out.println(containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2})); //true
        System.out.println(containsDuplicate(new int[] {})); //fasle
    }
    public static boolean containsDuplicate(int[] nums){
        Set <Integer> checkDups = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!checkDups.add(nums[i]))
                return true;
        }
        return false;
    }
}
