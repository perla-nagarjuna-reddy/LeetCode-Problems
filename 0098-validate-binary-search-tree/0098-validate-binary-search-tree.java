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
        return helper(root,null,null);
    }

    public boolean helper(TreeNode root,Integer low,Integer high){
        if(root == null){
            return true;
        }

        if(low != null && root.val <= low){
            return false;
        }
        if(high != null && root.val >= high){
            return false;
        }

        boolean leftTree = helper(root.left,low,root.val);
        boolean rightTree = helper(root.right,root.val,high);

        return leftTree && rightTree;
    }
}