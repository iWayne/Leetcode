'''
Q: Majority Element
Link: https://leetcode.com/problems/majority-element/

'''

#1st Time
class Solution(object):
    def majorityElement(self, nums):
        res = 0
        count = 0
        if len(nums) <= 0:
            return res
        for v in nums:
            if count == 0:
                res = v
                count = 1
            elif res == v:
                count += 1
            else :
                count -= 1
        return res
        

