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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode temp = head;

        while(temp != null){

            ListNode t1 = temp;

            while(t1 != null && t1.next != null && t1.val == t1.next.val){
                if(t1.next != null){
                    t1.next = t1.next.next;
                }
            }

            temp = temp.next;
        }

        return head;
    }
}