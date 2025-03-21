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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        ListNode slow = head;
        ListNode fast = head.next;

        if(fast == null){
            return head;
        }

        while(fast != null){
            int a = slow.val;
            int b = fast.val;

            int ans = gcd(a,b);

            ListNode newNode = new ListNode(ans);

            current.next = slow;
            current = slow;
            current.next = newNode;
            current = newNode;
            current.next = fast;
            slow =  fast;
            fast = fast.next;
        }

        return dummy.next;
    }

    static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b); 
    }


}