'''
Q: Merge Two Sorted Lists
Link: https://leetcode.com/problems/merge-two-sorted-lists/

'''

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        res = ListNode(0)
        cur = res
        
        while l1 and l2:
            if l1.val > l2.val:
                cur.next = l2
                l2 = l2.next
            else :
                cur.next = l1
                l1 = l1.next
            cur = cur.next
        
        cur.next = l1 if l1 else l2
        return res.next