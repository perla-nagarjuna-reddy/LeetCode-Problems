class Solution {
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        
        int low = 0;

        int high = chargeTimes.length;

        int ans = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(canRun(chargeTimes,runningCosts,mid,budget)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }

    public boolean canRun(int[] chargeTimes, int[] runningCosts,int k, long budget){


        if (k == 0) return true;
        int n = chargeTimes.length;

        Deque<Integer> deque = new ArrayDeque<>();
        long runningSum = 0;

        for (int i = 0; i < n; i++) {
            
            while (!deque.isEmpty() && chargeTimes[deque.peekLast()] <= chargeTimes[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);

            runningSum += runningCosts[i];

            if (i >= k) {
                runningSum -= runningCosts[i - k];
                if (deque.peekFirst() == i - k) {
                    deque.pollFirst();
                }
            }

            if (i >= k - 1) {
                long cost = chargeTimes[deque.peekFirst()] + (long) k * runningSum;
                if (cost <= budget) return true;
            }
        }
        return false;
    }
}