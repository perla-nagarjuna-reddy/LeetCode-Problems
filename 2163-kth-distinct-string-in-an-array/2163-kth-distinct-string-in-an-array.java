class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        int val = 0;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i]) == 1){
                val++;
                if(val == k) return arr[i];
            }
        }
        return "";
    }
}