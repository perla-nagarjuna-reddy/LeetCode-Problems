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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> lst = new ArrayList<>();
        List<Integer> lst1 = new ArrayList<>();
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        BFS(root1,lst);
        BFS(root2,lst1);
        return lst.equals(lst1);
    }

    public void BFS(TreeNode root,List<Integer> lst){
        if(root == null) return;
        if(root.left == null && root.right == null){
            lst.add(root.val);
            return;
        }
        BFS(root.left,lst);
        BFS(root.right,lst);
    }
}