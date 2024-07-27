class Solution {
    public int splitArray(int[] a, int k) {
        int min = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<a.length;i++){
            min = Math.max(min, a[i]);
            sum+=a[i];
        }

        int low = min;
        int high = sum;

        while(low<=high){
            int mid = (low+high) / 2;
            if(noOStudents(a,mid) > k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return low;
    }
    static int noOStudents(int arr[],int val){
        int totalSum = 0;
        int subArray = 1;

        for(int i=0;i<arr.length;i++){
            if(totalSum + arr[i] <= val){
                totalSum+=arr[i];
            }
            else{
                subArray++;
                totalSum = arr[i];
            }
        }

        return subArray; 
    }
}