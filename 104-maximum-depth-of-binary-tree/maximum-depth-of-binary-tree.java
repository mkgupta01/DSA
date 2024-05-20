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
    public int maxDepth(TreeNode root) {
        return helper(root)-1;
    }
    static int helper(TreeNode root){
        if(root == null){
            return 1;
        }

        int left = helper(root.left);
        int right = helper(root.right);

        return Math.max(left, right)+1;
    }
}