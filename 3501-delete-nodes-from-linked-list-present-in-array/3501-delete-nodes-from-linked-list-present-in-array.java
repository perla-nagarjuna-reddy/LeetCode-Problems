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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val :  nums){
            map.put(val,1);
        }

        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            if(!map.containsKey(temp.val)){
                arr.add(temp.val);
            }

            temp = temp.next;
        }
        return createLL(arr);
    }

    public ListNode createLL(List<Integer> arr){
        ListNode head = new ListNode(arr.get(0));
        ListNode mover = head;

        for(int i=1;i<arr.size();i++){
            ListNode temp = new ListNode(arr.get(i));
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
}