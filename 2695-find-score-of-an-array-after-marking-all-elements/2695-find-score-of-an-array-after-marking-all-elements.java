class Pair{
    int ele;
    int ind;

    public Pair(int ele, int ind){
        this.ele = ele;
        this.ind = ind;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair pair = (Pair) obj;
        return ele == pair.ele && ind == pair.ind;
    }
}

class Solution {
    public long findScore(int[] nums) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(
    (a, b) -> (a.ele == b.ele) ? Integer.compare(a.ind, b.ind) : Integer.compare(a.ele, b.ele)
);
        long ans = 0;
        List<Integer> lst = new ArrayList<>();

        for(int i = 0; i < nums.length ; i++){
            Pair pair = new Pair(nums[i],i);
            pq.add(pair);
            lst.add(nums[i]);
        }

        boolean[] removed = new boolean[nums.length];

        while(!pq.isEmpty()){

            Pair temp = pq.poll();

            if (removed[temp.ind]) continue; 

            ans = ans + temp.ele;
            
            int indc = temp.ind;

            int left = indc - 1;

            int right = indc + 1;

            if (left >= 0) {
                removed[left] = true;
            }

            if (right < nums.length) {
                removed[right] = true;
            }
        }

        return ans;
    }
}