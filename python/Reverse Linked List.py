'''
Q: Reverse Linked List
Link: https://leetcode.com/problems/reverse-linked-list/

'''

class Solution(object):
    def reverseList(self, head):
        if head is None or head.next is None:
            return head
        newHead = ListNode(0)
        newHead.next = head
        cur = head.next
        head.next = None
        
        while cur != None:
            next = cur.next
            cur.next = newHead.next
            newHead.next = cur
            cur = next
            
        return newHead.next