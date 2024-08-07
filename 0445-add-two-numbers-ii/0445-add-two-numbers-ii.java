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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = reverseOfLL(l1);
        ListNode temp2 = reverseOfLL(l2);
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int carry = 0;
        while(temp1 != null || temp2 != null){
            int sum = carry;
            if(temp1 != null) sum+=temp1.val;
            if(temp2 != null) sum+=temp2.val;
            ListNode newNode = new ListNode(sum % 10);
            current.next = newNode;
            current = newNode;
            carry = sum / 10;
            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }
        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }

        return reverseOfLL(dummy.next);
    }

    public ListNode reverseOfLL(ListNode node){
        ListNode tmp = node;
        ListNode prev = null;

        while(tmp != null){
            ListNode front = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = front;
        }

        return prev;
    }
}