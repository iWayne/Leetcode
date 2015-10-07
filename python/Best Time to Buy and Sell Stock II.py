'''
Q: Best Time to Buy and Sell Stock II
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

'''

class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        maxProfit = 0
        for i in range(len(prices) - 1):
            maxProfit += max(0, prices[i + 1] - prices[i])
        return maxProfit
                
                