'''
Q: Number of 1 Bits
Link: https://leetcode.com/problems/number-of-1-bits/

'''

class Solution(object):
    def hammingWeight(self, n):
        count = 0
        while n != 0:
            n &= (n-1)
            count += 1
        return count