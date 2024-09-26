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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int ind = 0;

        while(!q.isEmpty()){
            int size = q.size();
            int lastVal = (ind % 2 == 0)?Integer.MIN_VALUE:Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(ind % 2 == 0){
                    if(temp.val % 2 == 0 || temp.val <= lastVal){
                        return false;
                    }
                }
                else{
                    if(temp.val % 2 != 0 || temp.val >= lastVal){
                        return false;
                    }
                }

                lastVal = temp.val;

                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            ind++;
        }

        return true;
    }
}