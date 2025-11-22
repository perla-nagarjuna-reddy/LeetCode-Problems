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
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null) return head;
        
        ListNode slow = head;

        ListNode fast = head;

        ListNode prev = null;

        while(fast != null && fast.next != null){

            prev = slow;

            slow = slow.next;

            fast = fast.next.next;
        }

        prev.next = null;

        ListNode left = sortList(head);

        ListNode right = sortList(slow);

        return merge(left,right);
    }

    public ListNode merge(ListNode head,ListNode head1){

        ListNode dummy = new ListNode(-1);

        ListNode curr = dummy;

        ListNode temp1 = head;

        ListNode temp2 = head1;

        while(temp1 != null && temp2 != null){

            if(temp1.val < temp2.val){
                curr.next = temp1;
                curr = temp1;
                temp1 = temp1.next;
            }
            else{
                curr.next = temp2;
                curr = temp2;
                temp2 = temp2.next;
            }
        }

        while(temp1 != null){
            curr.next = temp1;
            curr = temp1;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            curr.next = temp2;
            curr = temp2;
            temp2 = temp2.next;
        }

        return dummy.next;
    }
}