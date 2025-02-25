class Solution {
    public long maxKelements(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        long ans = 0;

        for(int val : nums){
            pq.add(val);
        }

        System.out.println(pq);

        while(k > 0){
            int ele = pq.poll();
            ans = ans + ele;

            long ceilNum = (long)Math.ceil((double)ele / 3);

            pq.add((int)ceilNum);

            k--;
        }

        return ans;
    }
}