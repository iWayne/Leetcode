/**
* Q: Best Time to Buy and Sell Stock
* S: Traversal Array
* Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/

public class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }
}