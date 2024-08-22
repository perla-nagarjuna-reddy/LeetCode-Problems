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
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null) return null;
        int size = sizeOfLL(head);

        ListNode knode = head;
        for(int i=0;i<k-1;i++){
            knode = knode.next;
        }
        ListNode backNode = head;
        int cnt = 0;
        while(backNode != null){
            if(cnt == size -k){
                break;
            }
            cnt++;
            backNode = backNode.next;
        }
        int secondVal = knode.val;
        knode.val = backNode.val;
        backNode.val = secondVal;
        return head;

        
    }

    public int sizeOfLL(ListNode temp){
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
}