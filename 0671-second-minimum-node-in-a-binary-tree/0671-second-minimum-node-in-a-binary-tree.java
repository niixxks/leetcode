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
    ArrayList <Integer> ans = new ArrayList<>();
    public void solve( TreeNode root ){
        if ( root == null) return;
        solve(root.left);
        ans.add(root.val);
        solve(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        solve(root);
        Collections.sort(ans);
        int min = ans.get(0);
        for(int num : ans ){
          if(num > min) return num;
         }
        return -1;
    }
}