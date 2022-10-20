
package com.leetcode.practice;

import java.util.ArrayList;

//https://leetcode.com/problems/insert-interval/
public class AddInterval {
    public static void main(String [] args){
        printIntervals(insert(new int [][] {new int[] {1,3}, new int [] {4,6}, new int [] {8,9}}, new int[] {5,7}));
        printIntervals(insert(new int [][] {}, new int [] {1,6}));
        printIntervals(insert(new int [][] {new int[] {1,3}, new int [] {4,5}, new int [] {8,9}}, new int[] {6,7}));
    }
    // You have to create a new 2D array of length intervals.length+1 as that is the largest possible size
    // after submitting it seems that we cannot have an array with ending [0,0] so we need to use an array list
    public static int[][] insert(int[][] intervals, int[] newInterval){
        //int [][] updatedIntervals = new int [intervals.length+1][2];
        ArrayList<int[]> updatedIntervals = new ArrayList<>();
        boolean newAdded = false;
        int[] dynamic = newInterval;

        if(intervals.length == 0) {
            updatedIntervals.add(newInterval);
            return updatedIntervals.toArray(new int [updatedIntervals.size()][]);
        }

        // we can do this with one pass of the intervals array making it O(n)
        for(int i = 0; i < intervals.length; i++){
            if(!newAdded) {
                //check if the start of dynamic is greater than the current end
                //add current and dynamic
                if (intervals[i][1] < dynamic[0]) {
                    updatedIntervals.add(intervals[i]);
                }
                // check if the end of dynamic is less than the current start
                // add current interval
                else if (intervals[i][0] > dynamic[1]) {
                    updatedIntervals.add(dynamic);
                    updatedIntervals.add(intervals[i]);
                    newAdded = true;
                }
                // Combine the two intervals and go to next
                else {
                    dynamic[0] = Math.min(dynamic[0], intervals[i][0]);
                    dynamic[1] = Math.max(dynamic[1], intervals[i][1]);
                }
            }
            else
                updatedIntervals.add(intervals[i]);
        }

        if(!newAdded)
            updatedIntervals.add(dynamic);

        return updatedIntervals.toArray(new int [updatedIntervals.size()][]);
    }
    public static void printIntervals(int [][] intervals){
        System.out.print('[');
        for(int[] interval: intervals){
            System.out.print("[" + interval[0] + ", " + interval[1] + "]");
        }
        System.out.println("]");
    }
}
