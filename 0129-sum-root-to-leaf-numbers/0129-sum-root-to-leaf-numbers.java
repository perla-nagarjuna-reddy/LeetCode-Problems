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
    int sum  = 0;
    StringBuilder sb = new StringBuilder();
    public int sumNumbers(TreeNode root) {
        helper(root);
        return sum;
    }
    public void helper(TreeNode root){
        if(root == null){
            return;
        }
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            sum += Integer.parseInt(sb.toString());
        }
        helper(root.left);
        helper(root.right);
        sb.deleteCharAt(sb.length() - 1);
    }
}