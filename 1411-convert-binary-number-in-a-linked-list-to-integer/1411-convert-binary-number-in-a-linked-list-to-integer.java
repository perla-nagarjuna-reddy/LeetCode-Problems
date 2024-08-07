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
    public int getDecimalValue(ListNode head) {

        ListNode temp = head;
        int n = sizeOfLl(temp);
        int s = n-1;
        int val = 0;
        while(temp != null){
            val+=Math.pow(2,s)*temp.val;
            s = s-1;
            temp = temp.next;
        }

        return val;
    }

    public int sizeOfLl(ListNode node){
        int cnt = 0;

        while(node != null){
            cnt++;
            node = node.next;
        }

        return cnt;
    }
}