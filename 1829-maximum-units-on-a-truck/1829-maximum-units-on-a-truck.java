class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return b[1] - a[1];
            }
        });
        int sum = 0;
        for(int[] arr : boxTypes){
            if(truckSize == 0){
                break;
            }
            else if (truckSize >= arr[0]){
                sum = sum + arr[0] * arr[1];
                truckSize = truckSize - arr[0];
            }
            else{
                sum = sum +  (truckSize* arr[1]);
                break;
                
            }
        }
        return sum;
    }
}