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
    public ListNode removeNodes(ListNode head) {

        Stack<ListNode> st = new Stack<>();

        ListNode dummy = new ListNode(-1);

        ListNode current = dummy;


        ListNode temp = head;


        while(temp != null){

            while(!st.isEmpty() && st.peek().val < temp.val){
               st.pop(); 
            }

           st.push(temp);
           temp = temp.next;
        }

        while(!st.isEmpty()){
            ListNode temp1 = st.pop();
            if(temp1 != null){
                temp1.next = null;   
            }
            current.next = temp1;
            current = temp1;
        }


        return reverse(dummy.next);
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