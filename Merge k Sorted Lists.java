/**
* Q: Merge k Sorted Lists
* A: Sloved by Heap
* Link: https://leetcode.com/problems/merge-k-sorted-lists/
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length <= 0) {
            return null;
        }
        Queue<ListNode> que = new PriorityQueue<ListNode>(lists.length, idComparator);
        ListNode newHead = new ListNode(0);
        ListNode cur = newHead;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                que.add(lists[i]);
            }
        }
        while (!que.isEmpty()) {
            ListNode peek = que.poll();
            cur.next = peek;
            cur = cur.next;
            if (peek.next != null) {
                que.add(peek.next);
            }
        }
        return newHead.next;
    }
    
    public static Comparator<ListNode> idComparator = new Comparator<ListNode>(){
        public int compare(ListNode ln1, ListNode ln2) {
            return ln1.val - ln2.val;
        }
    };
}