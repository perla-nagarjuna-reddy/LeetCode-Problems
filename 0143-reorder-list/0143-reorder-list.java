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
    public void reorderList(ListNode head) {
        
        ListNode dummy = new ListNode(-1);

        ListNode curr = dummy;

        ListNode temp = head;

        while(temp != null){
            
            ListNode newNode = new ListNode(temp.val);

            curr.next = newNode;

            curr = newNode;

            temp = temp.next;
        }

        ListNode rev = reverse(dummy.next);

        ListNode slow = head;

        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode ans = new ListNode(-1);

        ListNode curr1 = ans;

        temp = head;

        while(temp != null){

            if(temp == slow){
                break;
            }
            ListNode newNode = new ListNode(temp.val);

            ListNode newNode1 = new ListNode(rev.val);

            curr1.next = newNode;

            newNode.next = newNode1;

            curr1 = newNode1;

            temp = temp.next;

            rev = rev.next;

        }

        if (fast != null && fast.next == null) {
            ListNode newNode = new ListNode(slow.val);
            curr1.next = newNode;
            curr1 = newNode;
        }

        temp = ans.next;
        ListNode currHead = head;

        while (temp != null && currHead != null) {
            currHead.val = temp.val;
            temp = temp.next;
            currHead = currHead.next;
        }

    }

    public ListNode reverse(ListNode head){

        ListNode curr = head;

        ListNode prev = null;

        while(curr != null){

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        return prev;
    }
}