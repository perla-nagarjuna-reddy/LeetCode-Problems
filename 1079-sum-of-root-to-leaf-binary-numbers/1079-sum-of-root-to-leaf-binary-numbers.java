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
    public int sumRootToLeaf(TreeNode root) {
        if(root == null){
            return 0;
        }
        helper(root,0);
        return sum;
    }
    public void helper(TreeNode root, int currentSum){
        if(root == null){
            return;
        }
        currentSum = (currentSum << 1) | root.val;
        if (root.left == null && root.right == null) {
            sum += currentSum;
            return;
        }
        helper(root.left,currentSum);
        helper(root.right,currentSum);
    }
}