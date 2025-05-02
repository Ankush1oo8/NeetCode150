/*
 * took a lot of time due to coping the answer but once understood got the answer
 */

 class Solution {
    public int maxProfit(int[] prices) {
     int min=prices[0];
     int profit=Integer.MIN_VALUE;
     for(int i:prices){
        profit=Math.max(profit,i-min);
        min=Math.min(min,i);
     }   
     return profit;
    }
}