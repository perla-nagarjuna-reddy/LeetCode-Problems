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
    public ListNode sortList(ListNode head) {
        List<Integer> lst = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            lst.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(lst);

        return createLL(lst);
    }

    public ListNode createLL(List<Integer> lst){
        if(lst.size() == 0) return null;
        ListNode head = new ListNode(lst.get(0));

        ListNode mover = head;

        for(int i=1;i<lst.size();i++){
            ListNode temp = new ListNode(lst.get(i));
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
}