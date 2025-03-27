class Solution {
    public int lengthOfLIS(int[] nums) {
        int n =  nums.length;

        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(nums[0]);
        for(int i = 1; i < n; i++){

            if(nums[i] > lst.get(lst.size() - 1)){
                lst.add(nums[i]);
            }
            else{
                
                int pos = do_binarySearch(lst, nums[i]);
                lst.set(pos, nums[i]); 
            }

            // prev = nums[i];
        }
 
        return lst.size();
    }

    public int do_binarySearch(ArrayList<Integer> lst,int val){

        int low = 0;

        int high = lst.size() - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(lst.get(mid) >= val){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}