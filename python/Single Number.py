'''
Q: Single Number
Link: https://leetcode.com/problems/single-number/

'''

#1st Time
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0
        for num in nums:
            res ^= num
        return res

#2nd Time
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        mp = {}
        for num in nums:
            if num in mp:
                mp[num] += 1
            else:
                mp[num] = 1
        
        for k in mp:
            if mp[k] == 1:
                return k


