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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode current = head;

        ListNode prev = null;
        
        ListNode temp = head;
        for (int i = 1; i < left; i++) {
            prev = temp;
            temp = temp.next;
        }

        ListNode leftNode = findLeftNode(head,left);

        ListNode rightNode= findLeftNode(head,right);

        ListNode rightNext = rightNode.next;

        rightNode.next = null;

        ListNode reversedHead = reverse(leftNode);

        if (prev != null) {
            prev.next = reversedHead;
        } else {
            head = reversedHead;
        }

        ListNode tail = reversedHead;
    
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = rightNext;
        
        leftNode.next = rightNext;

        return head;    
    
    }

    public ListNode findLeftNode(ListNode head,int left){

        left = left - 1;

        if(left == 0) return head;

        ListNode temp = head;

        while(temp != null && left >= 0){
            left--;
            if(left == 0){
                break;
            }
            temp = temp.next;
        }
        return temp.next;
    }


    public ListNode reverse(ListNode head){

        ListNode prev = null;

        ListNode temp = head;


        while(temp != null){

            ListNode front = temp.next;

            temp.next = prev;

            prev = temp;

            temp = front;
        }
        
        return prev;
    }
}

