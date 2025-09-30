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
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;

        ListNode fast = head;


        while(fast != null && fast.next != null){

            slow = slow.next;

            fast = fast.next.next;
        }

        ListNode rev = reverse(slow);

        ListNode first = head;

        ListNode second = rev;

        while(second != null){
            if(first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }

    public ListNode reverse(ListNode head){

        ListNode temp = head;

        ListNode prev = null;

        while(temp != null){

            ListNode fnt = temp.next;

            temp.next = prev;

            prev = temp;

            temp = fnt;
        }

        return prev;
    }
}
