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
    public boolean isValidBST(TreeNode root) {
    //     List<Integer> inOrder = new ArrayList<>();
    //     helper(root, inOrder);

    //     for(int i=0;i<inOrder.size()-1;i++){
    //         if(inOrder.get(i) >= inOrder.get(i+1))
    //             return false;
    //     }
    //     return true;

        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private void helper(TreeNode root, List<Integer> res){
        if(root!=null){
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }

    private boolean check(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        if(root.val >= max || root.val <= min){
            return false;
        }

        return check(root.left, min, root.val) && check(root.right, root.val, max);
    }
}