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
        HashMap<Integer,Integer> map = new HashMap<>();

        ListNode temp = head;
        while(temp != null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp = temp.next;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int val : map.keySet()){
            if(map.get(val) == 1){
                arr.add(val);
            }
        }

        Collections.sort(arr);

        return createLL(arr);
    }

    public ListNode createLL(ArrayList<Integer> arr){
        if(arr.size() == 0) return null; 
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