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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();

        leaf(root,"",ans);

        return ans;
    }

    public void leaf(TreeNode root,String res,List<String> ans){

        if(root == null) return;

        if(root.left == null && root.right == null){

            res+=Integer.toString(root.val);

            ans.add(res);
        }
        else{
            res+=Integer.toString(root.val)+"->";

            leaf(root.left,res,ans);
            leaf(root.right,res,ans);

        }
    }
}