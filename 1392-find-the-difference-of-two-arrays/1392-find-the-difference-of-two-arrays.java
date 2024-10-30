class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int val : nums2){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        Set<Integer> bannedSet = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        for(int val : bannedSet){
            if(!map.containsKey(val)){
                arr1.add(val);
            }
        }
        map.clear();
        for(int val : nums1){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        Set<Integer> bannedSet2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        for(int val : bannedSet2){
            if(!map.containsKey(val)){
                arr2.add(val);
            }
        }

        ans.add(arr1);
        ans.add(arr2);

        return ans;
    }
}