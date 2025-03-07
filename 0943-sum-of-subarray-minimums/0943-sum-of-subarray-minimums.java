class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse = findNse(arr);
        int[] pse = findPse(arr);
        long MOD = (long)(1e9 + 7);
        long total = 0;
        // System.out.println(Arrays.toString(nse));
        // System.out.println(Arrays.toString(pse));
        for(int i=0;i<arr.length;i++){
            int left = i - pse[i];
            int right = nse[i] - i;
            long product = (long)left * right * arr[i];
            // total=(total+(left*right*arr[i]) % MOD) % MOD;
            total = (total + product % MOD) % MOD;
        }

        return (int)total;
    }

    public int[] findNse(int[] arr){
        int[] nse = new int[arr.length];
        Stack<Integer>st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = arr.length;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(i);
        }
        return nse;
    }
    public int[] findPse(int[] arr){
        int[] pse = new int[arr.length];
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = st.peek();
            }
            st.push(i);
        }

        return pse;
    }

}