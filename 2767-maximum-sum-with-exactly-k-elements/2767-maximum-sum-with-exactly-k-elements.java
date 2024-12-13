class Solution {
    public int maximizeSum(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        int sum = 0; 

        for(int val : nums){
            maxHeap.add(val);
        }

        int ans = 0;

        while(k-- > 0){
            int ele = maxHeap.poll();
            ans += ele;
            maxHeap.add(ele+1);
        }

        return ans;
    }
}