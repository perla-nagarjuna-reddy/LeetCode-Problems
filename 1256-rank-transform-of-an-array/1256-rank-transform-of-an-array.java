class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0){
            return new int[]{};
        }
        int[] copyArr = Arrays.copyOf(arr,arr.length);
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(copyArr);
        int[] ans = new int[arr.length];
        int ind = 1;
        int prev = copyArr[0];
        map.put(prev,ind);
        for(int i=1;i<copyArr.length;i++){
            if(copyArr[i] == prev){
                map.put(copyArr[i],ind);
            }
            else if(copyArr[i] > prev){
                map.put(copyArr[i],ind+1);
                prev = copyArr[i];
                ind++;
            }
        }
        for(int i=0;i<arr.length;i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}