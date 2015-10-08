'''
Q: Best Time to Buy and Sell Stock
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

'''

#1st Time
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices) <= 0:
            return 0
        
        peek, bottom = prices[0], prices[0]
        maxProfit = 0
        
        for price in prices:
            if price < bottom:
                bottom = price
                peek = price
            else:
                peek = max(peek, price)
                maxProfit = max(maxProfit, peek - bottom)
        return maxProfit

#2nd Time
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices) <= 0:
            return 0
        bottom = prices[0]
        maxProf = 0
        
        for price in prices:
            bottom = min(bottom, price)
            maxProf = max(maxProf, price - bottom)
        return maxProf