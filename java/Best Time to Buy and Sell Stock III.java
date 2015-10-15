/**
* Q: Best Time to Buy and Sell Stock III
* S: Traversal Twice
* Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
*/

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int[] maxProfit = new int[prices.length];
        int preMax = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            preMax = Math.max(preMax, prices[i] - min);
            maxProfit[i] = preMax;
        }
        
        int max = Integer.MIN_VALUE;
        int maxResult = maxProfit[prices.length - 1];
        preMax = 0;
        
        for (int i = prices.length - 1; i >= 0; i--) {
            max = Math.max(prices[i], max);
            preMax = Math.max(preMax, max - prices[i]);
            if (i > 0) {
                maxResult = Math.max(maxResult, preMax + maxProfit[i - 1]);
            } else {
                maxResult= Math.max(maxResult, preMax);
            }
        }
        return maxResult;
    }
}