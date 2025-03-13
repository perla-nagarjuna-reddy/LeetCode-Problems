class Solution {
    public int findShortestSubArray(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
            if(map.get(val) >= max){
                max = map.get(val);
            }
        }

        int first  = -1;

        int second = -1;

        int ans = Integer.MAX_VALUE;

        for(int val : map.keySet()){
            int newNum = val;
            if(map.get(newNum) == max){
                for(int i = 0; i < nums.length; i++){
                    if(nums[i] == newNum){
                        if(first == -1){
                            first = i;
                        }
                        else{
                            second = i;
                        }
                    }
                }
                if(first != -1 && second !=-1){
                    ans = Math.min(second - first + 1, ans);
                    first  = -1;
                    second = -1;
                }
                else if(first != -1 && second ==-1){
                    ans = Math.min(first+1, ans);
                    first  = -1;
                    second = -1;
                }
                
            }
        }

        return ans;
    }
}