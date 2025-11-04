class Solution {
    public int[] findXSum(int[] nums, int k, int x) {

        

        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums.length;

        int[] ans = new int[n-k+1];

        int end = 0;

        int start = 0;

        int ind = 0;

        while(end < n){

            map.put(nums[end],map.getOrDefault(nums[end],0)+1);

            if((end - start + 1) < k){
                end++;
                continue;
            }

            else if((end - start + 1) == k){

                List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

                Collections.sort(list, (a, b) -> {
                    int valueCompare = b.getValue().compareTo(a.getValue()); 
                    if (valueCompare == 0) {
                        return b.getKey().compareTo(a.getKey()); 
                    }
                    return valueCompare;
                });

                int sum = 0;

                for (int i = 0; i < Math.min(x, list.size()); i++) {
                    sum += list.get(i).getKey() * list.get(i).getValue();
                }

                ans[ind++] = sum;

                map.put(nums[start],map.get(nums[start]) - 1);

                if(map.get(nums[start]) == 0){

                    map.remove(nums[start]);
                }
                start++;
            }

            end++;
        }

        return ans;
    }
}