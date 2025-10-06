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
    public ListNode oddEvenList(ListNode head) {

        if(head == null) return null;
        
        ListNode dummy = new ListNode(-1);

        ListNode point = null;

        dummy.next = point;

        point = dummy;


        ListNode dummy1 = new ListNode(-1);

        ListNode point1 = null;

        dummy1.next = point1;

        point1 = dummy1;


        ListNode curr = head;

        ListNode curr1 = head.next;


        while(curr != null){

            point.next = curr;

            point = curr;

            point1.next = curr1;

            point1 = curr1;

            if(curr.next == null || curr.next.next == null){
                break;
            }
            else{
                curr = curr.next.next;
                curr1 = curr1.next.next;
            }

        }

        dummy = dummy.next;
        curr.next = dummy1.next;
        return dummy;

    }
}