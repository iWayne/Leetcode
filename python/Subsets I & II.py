'''
Q: Subsets
Link: https://leetcode.com/problems/subsets/

'''

class Solution(object):
    def subsets(self, nums):
        res, count = [], 1 << len(nums)
        nums = sorted(nums)
        for i in range(count):
            cur = []
            for j in range(len(nums)):
                if i & 1 << j:
                    cur.append(nums[j])
            res.append(cur)
        return res



'''
Q: Subsets II 
Link: https://leetcode.com/problems/subsets-ii/

'''

#1st Time
class Solution(object):
    def subsetsWithDup(self, nums):
        res, count = [], 1 << len(nums)
        nums = sorted(nums)
        for i in range(count):
            cur = []
            for j in range(len(nums)):
                if i & 1 << j:
                    cur.append(nums[j])
            if cur not in res:
                res.append(cur)
        return res

#2nd Time
class Solution(object):
    def subsetsWithDup(self, nums):
        res = []
        nums = sorted(nums)
        self.builder(res, [], nums)
        return res
        
    def builder(self, res, cur, nums):
        if cur not in res:
            res.append(cur)
        for i in range(len(nums)):
            self.builder(res, cur + [nums[i]], nums[i+1:])
            if i+1 < len(nums) and nums[i] == nums[i+1]:
                continue


