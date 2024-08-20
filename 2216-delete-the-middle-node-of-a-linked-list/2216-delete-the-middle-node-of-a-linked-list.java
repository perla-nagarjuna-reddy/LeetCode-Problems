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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head == null || head.next == null){
            return null;
        }
        if(head.next.next == null){
            head.next= null;
            return  head;
        }
        ListNode slow = head;
        ListNode fast = head;
        // int n = sizeOfLL(head);
        ListNode prev = slow;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = slow.next;
        return head;

    }

    public int sizeOfLL(ListNode head){
        int cnt = 0;
        ListNode temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        return cnt;
    }
}