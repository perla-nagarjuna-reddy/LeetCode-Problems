/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        return buildBST(head, null);
    }
    private TreeNode buildBST(ListNode start, ListNode end) {
        if (start == end) return null;

        ListNode mid = getMiddleNode(start, end);
        TreeNode root = new TreeNode(mid.val);

        root.left = buildBST(start, mid);
        root.right = buildBST(mid.next, end);

        return root;
    }
    public ListNode getMiddleNode(ListNode head,ListNode end) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != end && fast.next != end){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}