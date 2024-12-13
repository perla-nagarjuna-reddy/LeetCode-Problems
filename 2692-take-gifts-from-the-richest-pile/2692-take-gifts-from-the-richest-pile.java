class Solution {
    public long pickGifts(int[] gifts, int k) {
        List<Integer> lst = new ArrayList<>();
        for(int val : gifts){
            lst.add(val);
        }
        while( k-- > 0){
            Collections.sort(lst);
            int ele = lst.get(lst.size() - 1);
            lst.remove(lst.size() - 1);
            int left = (int)Math.floor(Math.sqrt(ele));
            lst.add(left);
        }

        long sum = 0;

        for(int val : lst){
            sum += val;
        }

        return sum;
    }
}