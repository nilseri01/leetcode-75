// https://leetcode.com/problems/count-good-nodes-in-binary-tree
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return preOrderDFS(root, Integer.MIN_VALUE);
    }

    public int preOrderDFS(TreeNode node, int max) {
        if (node == null)
            return 0;

        boolean isGood = false;
        if (max <= node.val) {
            isGood = true;
            max = node.val;
        }

        return (isGood ? 1 : 0) + (preOrderDFS(node.left, max) + preOrderDFS(node.right, max));
    }
}
