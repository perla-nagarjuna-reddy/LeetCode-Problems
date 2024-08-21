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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;

        while(temp != null){
            ListNode kthNode = findKthNode(temp,k);
            if(kthNode ==  null){
                if(prevNode != null) prevNode.next = temp;
                break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverseLinkedList(temp);
            if(temp == head){
                head = kthNode;
            }
            else{
                prevNode.next = kthNode;
            }

            prevNode = temp;
            temp = nextNode;
        }

        return head;
    }

    public ListNode findKthNode(ListNode temp,int k){
        k-=1;
        while(temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode reverseLinkedList(ListNode temp){
        ListNode prevNode = null;

        while(temp != null){
            ListNode front = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = front;
        }

        return prevNode;
    }

}