'''
Q: Search Insert Position
Link: https://leetcode.com/problems/search-insert-position/

'''

class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        left, right, mid = 0, len(nums) - 1, 0
        while left + 1 < right:
            mid = left + (right - left) / 2
            if nums[mid] == target:
                return mid
            if nums[mid] > target:
                right = mid
            else:
                left = mid
        if nums[left] >= target:
            return left
        elif nums[right] >= target:
            return right
        else:
            return right + 1


