class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {

        int n = flowers.length;
        
        int[] starts = new int[n];

        int[] ends = new int[n];


        for(int i = 0; i < n; i++){

            starts[i] = flowers[i][0];

            ends[i] = flowers[i][1];
        }

        Arrays.sort(starts);

        Arrays.sort(ends);

        int[] ans = new int[people.length];


        for(int i = 0; i < people.length; i++){

            int start = getPosition(starts,people[i]);

            int end = getPosition(ends,people[i] - 1);

            ans[i] = start - end;

        }

        return ans;
    }

    public int getPosition(int[] arr, int val){

        int low = 0;

        int high = arr.length - 1;

        int ans = -1;

        while(low <= high){

            int mid =  low + (high - low) / 2;


            if(arr[mid] <= val){

                ans = mid;

                low = mid + 1;
            } 
            else{
                high = mid - 1;
            }
        }

        return ans + 1;
    }
}