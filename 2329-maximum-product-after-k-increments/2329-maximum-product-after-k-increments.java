class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        long MOD = 1_000_000_007;

        for(int val : nums){
            pq.add(val);
        }

        while(k > 0){
            int ele = pq.poll();

            ele = ele + 1;
            pq.add(ele);
            k--;
        }

        long ans = 1;

        while(!pq.isEmpty()){
            ans = (ans * pq.poll()) % MOD;
        }

        return (int)ans;
    }
}