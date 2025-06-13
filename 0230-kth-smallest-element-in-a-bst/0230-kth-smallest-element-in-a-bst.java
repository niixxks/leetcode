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
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    public int kthSmallest(TreeNode root, int k) {
        solve(root,k);
     
        return pq.poll();
    }
    public void solve(TreeNode root, int k){
        if(root==null) return;
        solve(root.left,k);
        pq.offer(root.val);
        if(pq.size()>k) pq.poll();
        solve(root.right,k);
    }
}