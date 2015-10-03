'''
Q: Climbing Stairs
Link: https://leetcode.com/problems/climbing-stairs/

'''

class Solution(object):
    def climbStairs(self, n):
        steps = [1,1]
        for i in range(2, n + 1):
            steps.append(steps[i-1] + steps[i-2])
        
        return steps[n]
        