'''
Q: Same Tree
Link: https://leetcode.com/problems/same-tree/

'''

class Solution(object):
    def isSameTree(self, p, q):
        if p and q :
            if p.val == q.val :
                return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
            else :
                return False
        elif p or q :
            return False
        return True