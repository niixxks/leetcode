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
    public int solve ( TreeNode root ,int maxsum[]){
        if (root == null) return 0 ;
         int  left = Math.max(0,solve(root.left , maxsum));
         int right = Math.max(0,solve(root.right , maxsum));
         maxsum[0]= Math.max(maxsum[0] , left+right+root.val);
        return root.val+ Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        int maxsum[]= new int[1];
        maxsum[0]= Integer.MIN_VALUE;
         solve(root , maxsum);
        return maxsum[0] ;
       
    }
}