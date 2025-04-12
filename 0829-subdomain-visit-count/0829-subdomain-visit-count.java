class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i < cpdomains.length; i++){

            String[] arr = cpdomains[i].split(" ");
            int count = Integer.valueOf(arr[0]);

            String[] temp = arr[1].split("\\.");

            if(temp.length == 3){
                String temp2 = temp[1]+"."+temp[2];
                map.put(arr[1],map.getOrDefault(arr[1],0)+count);
                map.put(temp2,map.getOrDefault(temp2,0)+count);
                map.put(temp[2],map.getOrDefault(temp[2],0)+count);
            }
            else if(temp.length == 2){

                map.put(arr[1],map.getOrDefault(arr[1],0)+count);
                map.put(temp[1],map.getOrDefault(temp[1],0)+count);
            }
        }
        List<String> ans = new ArrayList<>();

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String num = String.valueOf(entry.getValue());
            String s = entry.getKey();
            ans.add(num+" "+s);
        }
        return ans;
    }
}