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
class BSTIterator {
    int ind = 0;

    List<Integer> lst = new ArrayList<>();

    public BSTIterator(TreeNode root) {
        do_inorder(root);
    }
    
    public int next() {
        return lst.get(ind++);
    }
    
    public boolean hasNext() {
        return ind < lst.size();
    }

    private void do_inorder(TreeNode root){
        if(root == null){
            return;
        }

        do_inorder(root.left);
        lst.add(root.val);
        do_inorder(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */