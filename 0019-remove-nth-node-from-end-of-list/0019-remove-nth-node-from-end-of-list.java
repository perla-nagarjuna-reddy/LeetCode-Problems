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



        int  size = sizeOfLL(head);

        int deleteNode = size - n + 1;

        if(size == n){
            head = head.next;
            return head;
        }

        int count = 1;


        ListNode temp = head;

        while(temp != null){
            count++;
            if(count == deleteNode) break;
            
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }

    public int sizeOfLL(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}

//  int size = sizeOfLL(head);
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
//     }