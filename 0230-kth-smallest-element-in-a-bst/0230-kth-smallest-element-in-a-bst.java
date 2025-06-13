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
 *         this.right = right;f
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    public void inorder_traversal( TreeNode root){
        
        if (root == null) return ;
        ans.add(root.val);
        inorder_traversal (root.left);
        inorder_traversal(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
       inorder_traversal(root);
       Collections.sort(ans);
        return ans.get(k-1);
    }
}