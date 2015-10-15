/**
* Q: Best Time to Buy and Sell Stock II
* S: Count any profit
* Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
*/

public class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (min < prices[i]) {
                maxProfit += prices[i] - min;
            }
            min = prices[i];
        }
        return maxProfit;
    }
}