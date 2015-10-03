'''
Q: Remove Element
Link: https://leetcode.com/problems/remove-element/

'''

class Solution(object):
    def removeElement(self, nums, val):
        cur = 0
        for v in nums:
            if v != val:
                nums[cur] = v
                cur += 1
        return cur
        