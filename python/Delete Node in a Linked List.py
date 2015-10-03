'''
Q: Delete Node in a Linked List
S: 
Link: https://leetcode.com/problems/delete-node-in-a-linked-list/

'''

class Solution(object):
    def deleteNode(self, node):
        if node and node.next:
            node_del = node.next
            node.val = node.next.val
            node.next = node.next.next
            del node_del