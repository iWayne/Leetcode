'''
Q: Maximum Subarray
Link: https://leetcode.com/problems/maximum-subarray/

'''

class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) <= 0:
            return 0
            
        left, sub, res = 0, -1, nums[0]
        for i in range(len(nums)):
            if sub < 0:
                left = i
                sub = nums[i]
            else:
                sub += nums[i]
            res = max(res, sub)
        return res
        