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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;

        while(temp != null ){
            int val = temp.val;
            if(temp.next != null){
                temp.val = temp.next.val;
                temp.next.val = val;
                temp = temp.next;
            }             
            temp = temp.next;
        }

        return head;
    }
}