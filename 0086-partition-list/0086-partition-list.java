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
    public ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(-1);

        ListNode curr = small;

        ListNode big = new ListNode(-1);

        ListNode curr1 = big;

        ListNode temp = head;


        while(temp != null){

            if(temp.val >= x){
                curr1.next = temp;
                curr1 = temp;
            }
            else{
                curr.next = temp;
                curr = temp;
            }

            temp = temp.next;
        }

        curr1.next = null;

        curr.next = null;

        curr.next = big.next;
        
        temp = small;
        
        return small.next;

    }
}