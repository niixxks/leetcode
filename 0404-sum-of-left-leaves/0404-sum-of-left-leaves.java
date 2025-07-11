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
    int ans = 0;
    public void traverse ( TreeNode root){
        if ( root == null ) return ;

        if ( root.left != null){
            if( root.left.left == null && root.left.right == null){
                ans += root.left.val;
            }
        }
        traverse(root.left);
        traverse(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        traverse(root);
        return ans;
    }
}