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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0) return head;
        int cnt = 1;
        ListNode tail = head;
        ListNode temp = head;
        while(tail.next != null){
            cnt++;
            tail = tail.next;
        }
        if(k % cnt == 0) return head;
        k = k % cnt;
        tail.next = head;
        ListNode newLastNode = findNthNode(head,cnt-k);
        head = newLastNode.next;
        newLastNode.next = null;
        return head;
    }
    public ListNode findNthNode(ListNode temp,int k){
        int count = 1;

        while(temp != null){
            if(count == k) return temp;
            count++;
            temp = temp.next;
        }

        return temp;
    }
}