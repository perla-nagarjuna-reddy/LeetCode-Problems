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
    public int numComponents(ListNode head, int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){

            map.put(nums[i],i);
        }

        ListNode temp = head;

        int count = 0;

        while(temp != null){

            if(map.containsKey(temp.val) && (temp.next == null || !map.containsKey(temp.next.val))){
                count++;
            }

            temp = temp.next;
        }

        return count;

    }
}