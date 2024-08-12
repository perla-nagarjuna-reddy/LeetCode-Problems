class Solution {
    private PriorityQueue<Integer> minHeap;
    private int k;
    public int findKthLargest(int[] nums, int k) {
        this.k=k;
        minHeap=new PriorityQueue<>(new CustomerOrderComparator());

        for(int num:nums)
        {
            minHeap.add(num);
        }
        for(int i=0;i<k-1;i++){
            minHeap.poll();
        }
        return minHeap.poll();
    }
    static class CustomerOrderComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2)
        {
            return o1 < o2 ? 1 : -1;
        }
    }
}
