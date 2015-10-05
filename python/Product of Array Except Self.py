'''
Q: Product of Array Except Self
Link: https://leetcode.com/problems/product-of-array-except-self/

'''

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        multi = 1
        res = []
        
        for num in nums:
            res.append(multi)
            multi *= num
            
        multi = 1
        for i in range(1,len(nums) + 1):
            res[-i] *= multi
            multi *= nums[-i]
        
        return res
        