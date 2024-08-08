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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        if(head == null) return null;
        ListNode temp = head.next;
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int count = 0;
        int sum = 0;
        while(temp != null){
            
            if(temp.val == 0){
                System.out.println(sum);
                ListNode newNode = new ListNode(sum);
                current.next = newNode;
                current = newNode;
                sum = 0;
            }
            else if(temp.val != 0){
                sum+=temp.val;
            }
            temp = temp.next;
        }

        return dummy.next;
    }
}