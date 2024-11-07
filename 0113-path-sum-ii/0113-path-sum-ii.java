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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        hasPathSum(root,targetSum,lst,ans);

        return ans;
    }
    public void hasPathSum(TreeNode root, int targetSum,List<Integer> lst,List<List<Integer>> ans) {
        if(root == null){
            return;
        }
        lst.add(root.val);
        if(root.val == targetSum && (root.left == null && root.right == null)){
            ans.add(new ArrayList<>(lst));
        }
        else{
            hasPathSum(root.left,targetSum - root.val,lst,ans);
            hasPathSum(root.right,targetSum - root.val,lst,ans);
        }
        lst.remove(lst.size() - 1);

    }
}
