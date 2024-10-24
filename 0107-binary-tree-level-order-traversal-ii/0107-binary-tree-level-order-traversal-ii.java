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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> lst = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                lst.add(temp.val);
                // if it is not null then it will add left TreeNode
                if(temp.left != null){
                    q.offer(temp.left);
                }
                // if it is not null then it will add right TreeNode
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            ans.add(0,lst);
        }
        return ans;
    }
}