// https://leetcode.com/problems/leaf-similar-trees
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leavesList1 = new ArrayList<>();
        List<Integer> leavesList2 = new ArrayList<>();

        preOrderDFS(root1, leavesList1);
        preOrderDFS(root2, leavesList2);

        return leavesList1.equals(leavesList2);
    }

    public void preOrderDFS(TreeNode node, List<Integer> leaves) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return;
        }

        preOrderDFS(node.left, leaves);
        preOrderDFS(node.right, leaves);
    }
}
