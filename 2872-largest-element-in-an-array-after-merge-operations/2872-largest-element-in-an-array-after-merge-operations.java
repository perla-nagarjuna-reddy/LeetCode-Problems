class Solution {
    public long maxArrayValue(int[] nums) {

        long sum = 0;

        long[] arr = Arrays.stream(nums).asLongStream().toArray();


        for(int  i = arr.length - 1; i >= 0 ; i--){

            if(i-1 >= 0 && arr[i-1] <= arr[i]){
                arr[i-1]+=arr[i];
            }
        }

        for(long ele : arr){
            sum = Math.max(sum,ele);
        }

        return sum;
    }
}