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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    Stack<Integer> stack = new Stack<Integer>();
    
    
    while(temp != null){
        arr.add(temp.val);
        temp = temp.next;            
    }
    
    int[] res = new int[arr.size()];
    
    for(int i=arr.size()-1;i>=0;i--){
        int max = arr.get(i);
        while(!stack.isEmpty() && arr.get(stack.peek()) <= arr.get(i)){
            stack.pop();
        }
        
        if(stack.isEmpty()){
            res[i] = 0;
        }else{
            res[i] = arr.get(stack.peek());
        }
        
        stack.push(i);
        
    }
    
    return res;
    
}
}