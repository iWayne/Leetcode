'''
Q: Find Minimum in Rotated Sorted Array
Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

'''

class Solution(object):
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        start, end, mid = 0, len(nums) - 1, 0
        while start + 1 < end:
            mid = start + (end - start) / 2
            if nums[mid] < nums[end]:
                end = mid
            else:
                start = mid
        return min(nums[start], nums[end])
        