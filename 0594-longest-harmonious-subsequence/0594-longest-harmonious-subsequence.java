class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num :  nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> lst = new ArrayList<>(map.keySet());

        Collections.sort(lst);

        int max = 0;

        for(int i = 1; i < lst.size(); i++){
            if(lst.get(i) - lst.get(i-1) == 1){
                max = Math.max(map.get(lst.get(i))+map.get(lst.get(i-1)),max);
            }
        }

        return max;
    }
}