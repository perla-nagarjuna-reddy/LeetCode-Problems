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
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;
    boolean flag = false;
    public int findSecondMinimumValue(TreeNode root) {
        helper(root);
        return flag?second:-1;
    }
    public void helper(TreeNode root){
        if(root == null){
            return;
        }
        if(root.val < first)
        {
          first = root.val;
       }
       else if(root.val > first && root.val <= second)
       {
          second = root.val;
          flag = true;
       }
        helper(root.left);
        helper(root.right);
    }
}