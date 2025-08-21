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
    public int[][] spiralMatrix(int m, int n, ListNode head) {

        int[][] ans = new int[m][n];

        for(int i = 0; i < m; i++){
            Arrays.fill(ans[i],-1);
        }

        ListNode temp = head;

        int i = 0; 

        int j = 0;

        int count = 0;

        while(head != null) {

            ans[i][j] = head.val;

            

            if (i == count && j < n-count-1) {
                j++;
            } else if (j == n-count-1 && i < m-count-1) {
                i++;
            } else if (i == m-count-1 && j > count) {
                j--;
            } else if (i>count+1){
                i--;
                if (i == count+1)
                    count++;
            }
            head = head.next;
        }

        return ans;
    }
}