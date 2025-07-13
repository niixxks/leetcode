/**
 * Definition for a binary tree NODE.
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
    public TreeNode BuildTree( int [] nums , int left , int right){
        if(right<left) return null;
        int mid = (left+right)/2;
        TreeNode NODE = new TreeNode( nums[mid]);
         NODE.left = BuildTree(nums , left ,mid-1);
         NODE.right = BuildTree(nums , mid+1 ,right);
        return NODE;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
      return BuildTree(nums , 0,nums.length-1);
    }
}