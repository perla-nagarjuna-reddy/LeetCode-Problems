/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        boolean bool = false;
        while(true){
            if(fast == slow){
                bool = true;
                break;
            }
            else{
                slow = slow.next;
                fast = fast.next.next;
            }
        }

        return bool;
    }
}