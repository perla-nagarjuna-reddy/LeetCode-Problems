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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode();
        root = null;
        int n = preorder.length;
        for(int i=0;i<n;i++){
            root = BinarySearchTree(root,preorder[i]);
        }

        return root;
    }

    public TreeNode BinarySearchTree(TreeNode root,int val){
        if(root == null){
            return new TreeNode(val);
        }

        if(val > root.val){
            root.right = BinarySearchTree(root.right,val);
        }
        if(val < root.val){
            root.left = BinarySearchTree(root.left,val);
        }
        return root;
    }
}