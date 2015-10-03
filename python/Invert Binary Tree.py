'''
Q: Invert Binary Tree
S: 
Link: https://leetcode.com/problems/invert-binary-tree/

'''

class Solution(object):
    def invertTree(self, root):
        if root :
            root.left, root.right = root.right, root.left
            self.invertTree(root.left)
            self.invertTree(root.right)
        return root