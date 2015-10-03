'''
Q: Balanced Binary Tree
Link: https://leetcode.com/problems/balanced-binary-tree/

'''

#1st Time
class Solution(object):
    def isBalanced(self, root):
        if root is None:
            return True
        
        left = self.getDeepth(root.left)
        right = self.getDeepth(root.right)
        if abs(left - right) >= 2:
            return False
        else:
            return self.isBalanced(root.left) and self.isBalanced(root.right)
    
    def getDeepth(self, root):
        if root is None:
            return 0
        return max(self.getDeepth(root.left), self.getDeepth(root.right)) + 1