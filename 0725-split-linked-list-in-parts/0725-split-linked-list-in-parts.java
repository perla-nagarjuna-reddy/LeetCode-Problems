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
    public ListNode[] splitListToParts(ListNode head, int k) {

        

        ListNode[] ans = new ListNode[k];

        if(head == null) return ans;

        int totalLength = getSize(head);

        int eachBucket = totalLength / k;

        int rem = totalLength % k;

        ListNode prev = null;

        ListNode curr = head;

        for(int i = 0 ; i < k; i++){

            ans[i] = curr;

            int j = 0;

            while(j < (eachBucket + (rem > 0 ? 1 : 0))){

                prev = curr;
                
                curr = curr.next;

                j++;
            }

            prev.next = null;

            rem = rem - 1;
        }

        return ans;

    }

    public int getSize(ListNode head){

        ListNode temp = head;

        int count = 0;


        while(temp != null){
            count++;

            temp = temp.next;
        }

        return count;
    }
}