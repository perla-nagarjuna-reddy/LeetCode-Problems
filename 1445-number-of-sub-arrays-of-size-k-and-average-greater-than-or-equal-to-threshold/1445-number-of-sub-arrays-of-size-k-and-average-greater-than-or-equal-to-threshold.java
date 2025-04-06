class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int ans = 0;

        int i = 0;

        int j = 0;

        int sum = 0;

        while(j < arr.length){
            sum = sum + arr[j];

            if((j - i + 1) < k){
                j++;
                continue;
            }

            else if ((j - i + 1) == k){
                int avg = sum / k;

                if(avg >= threshold){
                    ans++;
                }
                sum = sum - arr[i];
                i++;
                j++;
            }
        }

        return ans;
    }
}