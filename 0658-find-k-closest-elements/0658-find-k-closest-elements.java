class Pair{
    int key;
    int diff;

    public Pair(int key,int diff){
        this.key = key;
        this.diff = diff;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        Comparator<Pair> diffComparator = new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if (p1.diff == p2.diff) {
                    return Integer.compare(p1.key, p2.key); 
                }
                return Integer.compare(p1.diff, p2.diff);
            }
        };
        PriorityQueue<Pair> pq = new PriorityQueue<>(diffComparator);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            Pair ele = new Pair(arr[i],Math.abs(arr[i]-x));
            pq.add(ele);
        }
       
        while(k -- > 0){
            ans.add(pq.poll().key);
        }
        Collections.sort(ans);
        return ans;
    }
}