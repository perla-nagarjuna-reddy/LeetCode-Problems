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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;
        ListNode slow = head;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

// int size = sizeOfLL(head);
//         int toBeDeletedNode = size - n + 1;
//         if(size == n){
//             head = head.next;
//             return head;
//         }
//         ListNode temp = head,prev = null;
//         int cnt = 1;
//         while(temp != null){
//             if(cnt == toBeDeletedNode) break;
//             cnt++;
//             prev = temp;
//             temp = temp.next;
//         }
//         prev.next = prev.next.next;
//         return head;
//     }

//     public int sizeOfLL(ListNode head){
//         ListNode temp = head;
//         int count = 0;
//         while(temp != null){
//             count++;
//             temp = temp.next;
//         }
//         return count;