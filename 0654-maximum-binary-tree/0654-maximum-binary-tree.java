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
    

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMBT(nums,0,nums.length - 1);
    }

    public TreeNode constructMBT(int[] nums, int start, int end){

        if(start > end) return null;

        int ind = -1;

        int max = Integer.MIN_VALUE;

        for(int i = start; i <= end; i++){

            if (nums[i] > max) {
                max = nums[i];
                ind = i;
            }
        }

        TreeNode root = new TreeNode(nums[ind]);

        root.left = constructMBT(nums,start, ind - 1);

        root.right = constructMBT(nums,ind+1, end);

        return root;
    }
}