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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null && list2 != null){
            return list2;
        }
        if(list1 != null && list2 == null){
            return list1;
        }
        ListNode dummy = new ListNode(-1);
        ListNode mover = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                ListNode node = new ListNode(temp1.val);
                // System.out.println(temp1.val);
                mover.next = node;
                mover = node;
                temp1 = temp1.next;
            }
            else{
                ListNode node = new ListNode(temp2.val);
                // System.out.println(temp2.val);
                mover.next = node;
                mover = node;
                temp2 = temp2.next;
            }
        }

        while(temp1 != null){
            ListNode node = new ListNode(temp1.val);
            System.out.println(temp1.val);
            mover.next = node;
            mover = node;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            ListNode node = new ListNode(temp2.val);
            System.out.println(temp2.val);
            mover.next = node;
            mover = node;
            temp2 = temp2.next;
        }
        return dummy.next;

    }
}