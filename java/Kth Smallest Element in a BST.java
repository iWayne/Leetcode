/**
* Q: Kth Smallest Element in a BST
* S_1: Pre-order Traversal
* Link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        Stack<TreeNode> sk = new Stack<TreeNode>();
        while (!sk.isEmpty() || root != null) {
            while (root != null) {
                sk.push(root);
                root = root.left;
            }
            root = sk.pop();
            k--;
            if (k == 0) {
                return root.val;
            }
            root = root.right;
        } 
        return -1;
    }
}

/**
* Q: Kth Smallest Element in a BST
* S_2: Count the # of nodes in the left subtree
* Link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        int countsub = countSubTree(root.left);
        while (countsub + 1 != k) {
            if (countsub + 1 > k) {
                root = root.left;
            } else {
                k = k - countsub - 1;
                root  = root.right;
            }
            countsub = countSubTree(root.left);
        }
        return root.val;
    }
    public int countSubTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countSubTree(root.left) + countSubTree(root.right) + 1;
    }
}