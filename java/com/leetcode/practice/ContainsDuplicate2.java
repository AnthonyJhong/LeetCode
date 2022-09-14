package com.leetcode.practice;
import java.util.HashSet;

// https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicate2 {
    public static void main (String [] args){
        //System.out.println(containsNearbyDuplicate(new int[] {}, ));
        System.out.println(containsNearbyDuplicate2(new int[] {1,2,3,1}, 3));
        System.out.println(containsNearbyDuplicate2(new int[] {1,0,1,1}, 1));
        System.out.println(containsNearbyDuplicate2(new int[] {1,2,3,1,2,3}, 2));
        System.out.println(containsNearbyDuplicate2(new int[] {1}, 1));
        System.out.println(containsNearbyDuplicate2(new int[] {1,2,1,2}, 1));
        System.out.println(containsNearbyDuplicate2(new int[] {2}, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int iterK = k;
        for(int i = 0; i < nums.length; i++){

            if(i + k > nums.length-1)
                iterK = nums.length-1 - i;
            else
                iterK = k;

            for(int j = 1; j <= iterK; j++){
                if(nums[i] == nums[i+j])
                    return true;
            }
        }
        return false;
    }
    // to make this faster we can use a set as sets only allow 1 of each value removing it once we pass k number of values
    // i-k-1 ensures that we have k numbers in the set, and we check up to K+1
    public static boolean containsNearbyDuplicate2(int[] nums, int k){
        HashSet <Integer> checkDups = new HashSet<>();
        boolean check;
        for(int i = 0; i < nums.length; i++){
            if(i>k) checkDups.remove(nums[i-k-1]);
            check = checkDups.add(nums[i]);
            if(!check) return true;
        }
        return false;
    }

    public static void printSet(HashSet<Integer> e){
        for(int i: e)
            System.out.print(i + " ");
        System.out.println();
    }
}
