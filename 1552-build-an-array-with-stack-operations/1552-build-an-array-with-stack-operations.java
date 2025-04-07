class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<Integer> lst = new ArrayList<>();

        List<String> ans = new ArrayList<>();

        int tar = target[target.length - 1];

        for(int val : target){
            lst.add(val);
        }

        for(int i = 1; i <= tar ; i++){
            if(lst.contains(i)){
                ans.add("Push");
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}