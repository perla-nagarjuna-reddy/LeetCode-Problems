class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] copiedArray = Arrays.copyOf(score,n);
        Arrays.sort(copiedArray);
        HashMap<Integer,String> map = new HashMap<>();
        int ind = 1;
        for(int i=n-1;i>=0;i--){
            if(ind == 1){
                map.put(copiedArray[i],"Gold Medal");
            }
            else if(ind == 2){
                map.put(copiedArray[i],"Silver Medal");
            }
            else if(ind == 3){
                map.put(copiedArray[i],"Bronze Medal");
            }
            else{
                map.put(copiedArray[i],String.valueOf(ind));
            }
            ind++;
        }
        String ans[] = new String[n];

        for(int i=0;i<n;i++){
            ans[i] = map.get(score[i]);
        }

        return ans;
    }
}