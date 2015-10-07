'''
Q: Missing Number
Link: https://leetcode.com/problems/missing-number/

'''

class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 0
        while i < len(nums):
            if nums[i] != i and 0 <= nums[i] < len(nums):
                val = nums[i]
                nums[i], nums[val] = nums[val], nums[i]
            else:
                i += 1
                
        for i in range(len(nums)):
            if nums[i] != i:
                return i
        return len(nums)
        