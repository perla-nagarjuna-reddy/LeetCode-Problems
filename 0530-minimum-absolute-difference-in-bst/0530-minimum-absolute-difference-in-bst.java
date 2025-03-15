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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        solve(root,lst);
        Collections.sort(lst);

        int min = Integer.MAX_VALUE;

        for(int i = 1; i < lst.size(); i++){
            min = Math.min(min,lst.get(i) - lst.get(i-1));
        }

        return min;
    }

    void solve(TreeNode root,List<Integer> lst){
        if(root == null){
            return;
        }

        lst.add(root.val);

        solve(root.left,lst);
        solve(root.right,lst);
    }
}