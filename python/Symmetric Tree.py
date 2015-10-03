'''
Q: Symmetric Tree
Link: https://leetcode.com/problems/symmetric-tree/

'''

class Solution(object):
    def isSymmetric(self, root):
        if root is None:
            return True
        return self.isSymmetric2(root.left, root.right)
    
    def isSymmetric2(self, left, right):
        if left and right:
            if left.val != right.val:
                return False
            else:
                return self.isSymmetric2(left.left, right.right) and \
                        self.isSymmetric2(left.right, right.left)
        elif left or right:
            return False
        
        return True