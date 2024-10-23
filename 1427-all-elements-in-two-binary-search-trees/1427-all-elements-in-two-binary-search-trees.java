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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        if(root1 == null && root2 == null){
            return ans;
        }
        if(root1 == null && root2 != null){
            BFS(root2,ans);
        }
        else if(root2 == null && root1 != null){
            BFS(root1,ans);
        }
        else{
            BFS(root1,ans);
            BFS(root2,ans);
        }

        Collections.sort(ans);

        return ans;
        
    }

    public void BFS(TreeNode root,List<Integer> ans){
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i < size;i++){
                TreeNode temp = q.poll();
                ans.add(temp.val);

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
    }
}