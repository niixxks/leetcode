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
    public int solve(TreeNode root) {
        if (root == null) return 0;

        int sum = 0;

        // Check if the left child is a left leaf
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        // Recursively check left and right subtrees
        sum += solve(root.left);
        sum += solve(root.right);

        return sum;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return solve(root);
    }
}
