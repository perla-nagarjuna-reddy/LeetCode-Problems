class Solution {
    public String findDifferentBinaryString(String[] nums) {

        List<String> ans = new ArrayList<>();

        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            map.put(nums[i],1);
            StringBuilder sb = new StringBuilder(nums[i]);
            if(sb.charAt(i) == '0'){
               sb.replace(i, i+1, "1");
               ans.add(sb.toString());
            }
            else if(sb.charAt(i) == '1'){
               sb.replace(i, i+1, "0");
               ans.add(sb.toString());
            }
        }


        for(String s : ans){
            if(!map.containsKey(s)){
                return s;
            }
        }

        System.out.println(ans);

        return "";

    }
}