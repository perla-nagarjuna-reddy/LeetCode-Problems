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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {


        if(depth == 1){
            TreeNode temp = new TreeNode(val);

            temp.left = root;

            root = temp;

            return root;
        }

        return solve(root,val,1,depth);
    }

    public TreeNode solve(TreeNode root, int val, int lev, int depth){


        if(root == null){
            return null;
        }

        if(lev == depth - 1){
            TreeNode left = new TreeNode(val);
            TreeNode right = new TreeNode(val);

            left.left = root.left;
            right.right = root.right;

            root.left = left;

            root.right = right;

            return root;
        }

        root.left = solve(root.left, val, lev + 1, depth);
        root.right = solve(root.right, val, lev + 1, depth);
        
        return root;

    }
}