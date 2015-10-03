'''
Q: Move Zeroes
S: 
Link: https://leetcode.com/problems/move-zeroes/

'''

class Solution(object):
    def moveZeroes(self, nums):
        cur = 0
        for i in range(len(nums)):
            if nums[i] != 0 :
                nums[cur], nums[i] = nums[i], nums[cur]
                cur += 1