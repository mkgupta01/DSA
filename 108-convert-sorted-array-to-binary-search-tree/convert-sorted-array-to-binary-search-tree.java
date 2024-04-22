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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode ans = helper(nums,0, nums.length-1);
        return ans;
    }
    private TreeNode helper(int[] arr, int s, int e){
        if(s>e){
            return null;
        }
        int mid = s+(e-s)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = helper(arr,s, mid-1);
        node.right = helper(arr, mid+1, e);
        return node;
    }
}