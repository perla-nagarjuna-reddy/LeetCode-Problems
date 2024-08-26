class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq =  new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.getFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.getLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.offer(i);
            if(i >= k-1) list.add(nums[dq.getFirst()]);
        }
        int[] ans = new int[list.size()];

        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}