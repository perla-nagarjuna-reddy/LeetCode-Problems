class Solution {
    public int[] sumZero(int n) {
        int d = -(n/2);
        int[] arr = new int[n];
        if(n%2!=0){
            for(int i=0;i<n;i++){
                arr[i]=d;
                d = d+1;
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(d==0){
                d=d+1;
                }
                arr[i]=d;
                d = d+1;
            }
        }
        return arr;
    }
}