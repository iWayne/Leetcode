'''
Q: Lowest Common Ancestor of a Binary Search Tree
S: 
Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

'''

#1st Time

class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        if root is None :
            return None
        if root is p or root is q :
            return root
            
        left = self.lowestCommonAncestor(root.left, p, q)
        right = self.lowestCommonAncestor(root.right, p, q)
        
        if left and right :
            return root
        if left :
            return left
        else :
            return right


#2nd Time

class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        left, right = sorted([q.val,p.val])
        
        while not left <= root.val <= right :
            root = root.left if root.val > right else root.right
        
        return root

#3rd Time

class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        if root in (None, p, q) :
            return root
            
        left, right = [self.lowestCommonAncestor(child, p, q) for child in [root.left, root.right]]
        
        return root if left and right else left or right