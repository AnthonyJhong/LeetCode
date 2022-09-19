package com.leetcode.practice;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class StockProfit {
    public static void main(String [] args){
        //System.out.println(maxProfit(new int[] {}));
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[] {7,6,4,3,1}));
        System.out.println(maxProfit(new int[] {10}));
    }

    //brute force n^2 failed because too slow
    public static int maxProfitSlow(int [] prices){
        int largestProfit = 0;

        for(int i = 0; i < prices.length-1; i++){
            for(int j = i + 1; j < prices.length; j++){
                if(prices[j] - prices[i] > largestProfit)
                    largestProfit = prices[j] - prices[i];
            }
        }

        return largestProfit;
    }
    //O(n)
    public static int maxProfit(int [] prices) {
        int lowestPrice = Integer.MAX_VALUE, highestProfit = 0;
        //Keep track of the lowest and the current highest at the same time
        for(int i = 0; i < prices.length; i++){
           lowestPrice = Math.min(lowestPrice, prices[i]);
           highestProfit = Math.max(highestProfit, prices[i] - lowestPrice);
        }
        return highestProfit;
    }
}
