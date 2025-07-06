class FindSumPairs {
    
    int[] arr1;
    int[] arr2;
    HashMap<Integer,Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        arr1 = nums1;
        arr2 = nums2;
        map = new HashMap<>();
        for(int val : arr2){
            map.put(val,map.getOrDefault(val,0)+1);
        }
    }
    
    public void add(int index, int val) {
        
        if(index < arr2.length){
            
            int old_val = arr2[index];

            int new_val = arr2[index] + val;

            map.put(old_val,map.get(old_val) - 1);

            if(map.get(old_val) == 0){
                map.remove(old_val);
            }

            arr2[index] = new_val;
            map.put(new_val,map.getOrDefault(new_val,0)+1);

        }
    }
    
    public int count(int tot) {
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int val : arr1){
        //     map.put(tot - val,map.getOrDefault(tot - val,0)+1);
        // }


        int ans = 0;

        

        for(int val : arr1){

            int num = tot - val;

            if(map.containsKey(num)){
                ans = ans + map.get(num);
            }
        }
        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */