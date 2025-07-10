class Solution {
    public int countTriplets(int[] arr) {

        int ans = 0;


        for(int i = 0; i < arr.length; i++){

            int sum = 0;
    
            for(int k = i; k < arr.length; k++){

                sum = sum ^ arr[k];

                if(sum == 0 && k > i) ans += (k - i);
            }
        }

        return ans;
    }
}