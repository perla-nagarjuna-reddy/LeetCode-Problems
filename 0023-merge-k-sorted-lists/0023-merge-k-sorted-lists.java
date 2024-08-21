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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];

            while(temp != null){
                ans.add(temp.val);
                temp = temp.next;
            }
        }

        Collections.sort(ans);
        return convertArrToLL(ans);
    }

    public ListNode convertArrToLL(ArrayList<Integer> ans){
        if(ans.size() == 0) return null;
        ListNode head = new ListNode(ans.get(0));
        ListNode mover = head;
        for(int i=1;i<ans.size();i++){
            ListNode node = new ListNode(ans.get(i));
            mover.next = node;
            mover = node;
        }
        return head;
    }
}