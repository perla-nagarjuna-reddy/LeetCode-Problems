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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode dummy = new ListNode(-1);
        ListNode mover = dummy;

        ListNode prev  = null;
        
        for(int i=0;i<a;i++){
            prev = temp;
            mover.next = temp;
            mover = temp;
            temp = temp.next; 
        }
        for(int i=a;i<=b;i++){
            prev = prev.next;
        }
        System.out.println(prev.val);
        ListNode temp1 = list2;

        while(temp1 != null){
            mover.next = temp1;
            mover = temp1;
            temp1 = temp1.next;
        }

        ListNode rand = prev.next;

        while(rand != null){
            mover.next = rand;
            mover = rand;
            rand  = rand.next;
        }
        return dummy.next;

    }
}