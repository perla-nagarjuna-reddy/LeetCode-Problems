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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }
}

// ListNode oddNode = new ListNode(-1);
//         ListNode evenNode = new ListNode(-1);
//         ListNode current1 = oddNode;
//         ListNode current2 = evenNode;
//         ListNode temp = head;
//         int count = 1;
//         while(temp != null){
//             if(count % 2 == 1){
//                 ListNode node = new ListNode(temp.val);
//                 current1.next = node;
//                 current1 = node;
//             }
//             else{
//                 ListNode node = new ListNode(temp.val);
//                 current2.next = node;
//                 current2 = node;
//             }
//             temp = temp.next;
//             count++;
//         }
//         current1.next = evenNode.next;
//         return oddNode.next;