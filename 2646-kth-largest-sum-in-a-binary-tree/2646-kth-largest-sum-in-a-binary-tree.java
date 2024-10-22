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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Long> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();

            long sum = 0;

            for(int i=0; i < size;i++){
                TreeNode temp = q.poll();
                sum+=temp.val;

                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            ans.add(sum);
        }

        if(ans.size() < k){
            return -1;
        }

        Collections.sort(ans);

        return ans.get(ans.size() - k);
    }
}