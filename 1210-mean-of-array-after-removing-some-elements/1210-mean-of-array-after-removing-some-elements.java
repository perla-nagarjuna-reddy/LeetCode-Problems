class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);

        int pos = (10 * arr.length) / 100;

        int start = pos/2;

        int end = pos/2;

        double ans = 0.0;

        for(int i=start;i<arr.length-end;i++){
            ans +=arr[i];
        }
        System.out.println(ans);
        return (ans / (arr.length - pos));

    }
}