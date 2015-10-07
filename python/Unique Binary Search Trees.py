'''
Q: Unique Binary Search Trees
Link: https://leetcode.com/problems/unique-binary-search-trees/

'''

class Solution(object):
    def numTrees(self, n):
        """
        :type n: int
        :rtype: int
        """
        count = [1,1]
        for i in range(2, n + 1):
            count.append(0)
            for j in range(0, i):
                count[i] += count[j] * count[i - j - 1]
        return count[n]