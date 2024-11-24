class Solution {
    public int distinctAverages(int[] nums) {
        Set<Float> set = new HashSet<>();

        List<Integer> lst = new ArrayList<>();
        for(int val : nums){
            lst.add(val);
        }
        Collections.sort(lst);
        while(lst.size() > 0){
            int min = lst.get(0);
            int max = lst.get(lst.size()-1);
            float avg = (min + max) / 2.0f;
            set.add(avg);
            lst.remove(0);
            lst.remove(lst.size() - 1);
        }
        return set.size();
    }
}