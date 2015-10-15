/**
* Q: Best Time to Buy and Sell Stock IV
* S: Dynamic Processing with two matrics
* Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
*/

public class Solution {
    public int maxProfit(int k, int[] prices) {
        if(k<=0 || prices.length <=1) return 0;
        if(k >= prices.length/2){
            int sum = 0;
            for(int i=0; i<prices.length-1;i++) sum += Math.max(prices[i+1]-prices[i],0);
            return sum;
        }
        int days = prices.length;
        int[][] local = new int[k+1][days];
        int[][] global = new int[k+1][days];
        for(int i=1;i<=k;i++){
            for(int j=1; j<days;j++){
                int diff = prices[j]-prices[j-1];
                local[i][j] = Math.max(global[i-1][j-1], local[i][j-1]+diff);
                global[i][j] = Math.max(global[i][j-1], local[i][j]);
            }
        }
        return global[k][days-1];
    }
}