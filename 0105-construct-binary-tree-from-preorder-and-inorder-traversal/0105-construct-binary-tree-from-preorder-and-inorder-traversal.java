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
   public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int pstart, int pend, int istart, int iend) {
        if (pstart > pend || istart > iend) return null;
        TreeNode root = new TreeNode(preorder[pstart]);
        int inRoot = istart;
        while (inorder[inRoot] != preorder[pstart]) {
            inRoot++;
        }
        int numsLeft = inRoot - istart;
        root.left = build(preorder, inorder, pstart + 1, pstart + numsLeft, istart, inRoot - 1);
        root.right = build(preorder, inorder, pstart + numsLeft + 1, pend, inRoot + 1, iend);
        return root;
    }
}