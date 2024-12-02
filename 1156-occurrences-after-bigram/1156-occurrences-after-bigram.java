class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        List<String> ans = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(i+2 < arr.length && arr[i].equals(first) && arr[i+1].equals(second)){
                ans.add(arr[i+2]);
            }
        }
        String[] res = new String[ans.size()];
        
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }

        return res;
    }
}