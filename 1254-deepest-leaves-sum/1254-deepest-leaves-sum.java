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
    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> res = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();

                res.add(temp.val);
                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            ans.add(res);
        }

        int sum  = 0;
        for(int i=0;i<ans.get(ans.size()-1).size();i++){
            sum+=ans.get(ans.size()-1).get(i);
        }

        return sum;
    }

    
}