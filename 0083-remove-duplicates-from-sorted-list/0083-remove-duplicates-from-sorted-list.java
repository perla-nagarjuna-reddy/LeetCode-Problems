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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) return head;
        ListNode temp = head; // Initialize the pointer to traverse the list
        
        while (temp.next != null) { // Continue until the end of the list
            if (temp.val == temp.next.val) { // Check if current node is a duplicate
                temp.next = temp.next.next; // Skip the duplicate node
            } else {
                temp = temp.next; // Move to the next node
            }
        }
        
        return head; // Return the modified list
    }
       
}


//  ArrayList<Integer> arr = new ArrayList<>();

//         ListNode temp = head;

//         while(temp != null){
//             if(arr.contains(temp.val)){
//                 temp = temp.next;
//                 continue;
//             }
//             else{
//                 arr.add(temp.val);
//             }
//             temp = temp.next;
//         }

//         return createLL(arr);
//     }

//     public ListNode createLL(ArrayList<Integer> arr){
//         ListNode head = new ListNode(arr.get(0));
//         ListNode mover = head;
//         for(int i=1;i<arr.size();i++){
//             ListNode temp = new ListNode(arr.get(i));
//             mover.next = temp;
//             mover = temp;
//         }

//         return head;
//     }