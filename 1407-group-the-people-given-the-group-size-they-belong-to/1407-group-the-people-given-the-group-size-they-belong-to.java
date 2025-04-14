class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i = 0 ; i < groupSizes.length; i++){
            int val = groupSizes[i];
            if(map.containsKey(val)){
                List<Integer> ls = map.get(val);
                ls.add(i);
                map.put(val,ls);
            }
            else{
                List<Integer> lst = new ArrayList<>();
                lst.add(i);
                map.put(val,lst);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();

        for (int size : map.keySet()) {
            List<Integer> people = map.get(size);
            for (int i = 0; i < people.size(); i += size) {
                ans.add(people.subList(i, i + size));
            }
        }

        return ans;
    }
}