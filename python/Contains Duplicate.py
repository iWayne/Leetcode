'''
Q: Contains Duplicate
Link: https://leetcode.com/problems/contains-duplicate/

'''

#1st Time
class Solution(object):
    def containsDuplicate(self, nums):
        s = set()
        for v in nums:
            if v in s:
                return True
            else:
                s.add(v)
        return False


#2nd Time
class Solution(object):
    def containsDuplicate(self, nums):
        return len(nums) > len(set(nums))
        