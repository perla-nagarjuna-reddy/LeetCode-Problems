class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        for(int num : nums){
            if(num < 0){
                lst2.add(num);
            }
            else{
                lst.add(num);
            }
        }
        int n = lst.size()+lst2.size();
        int j=0;
        int[] ans = new int[n];

        for(int i=0;i<n/2;i++){
            ans[j++] = lst.get(i);
            ans[j++] = lst2.get(i);
        }
        System.out.println(lst2);
        return ans;
    }
}