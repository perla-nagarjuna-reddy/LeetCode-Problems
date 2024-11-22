class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set = removeDuplicates(nums1);
        Set<Integer> set1 = removeDuplicates(nums2);
        Set<Integer> set2 = removeDuplicates(nums3);

        HashMap<Integer,Integer> map = new HashMap<>();

        freq(set,map);
        freq(set1,map);
        freq(set2,map);
        List<Integer> ans = new ArrayList<>();

        for(int val : map.keySet()){
            if(map.get(val) >= 2){
                ans.add(val);
            }
        }

        return ans;

    }

    public void freq(Set<Integer> set,HashMap<Integer,Integer> map){
        for(int val : set){
            map.put(val,map.getOrDefault(val,0)+1);
        }
    }

    public Set<Integer> removeDuplicates(int[] arr){
        Set<Integer> set = new HashSet<>();

        for(int val : arr){
            set.add(val);
        }

        return set;
    }
    
}