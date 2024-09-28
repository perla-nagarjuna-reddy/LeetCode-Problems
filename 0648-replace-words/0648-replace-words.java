class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashMap<String,Integer> map = new HashMap<>();
        int len = dictionary.get(0).length();
        String[] arr = sentence.split(" ");
        for(String st : dictionary){
            map.put(st,st.length());
        }
        // System.out.println(Arrays.toString(arr));
        String s = "";

        for(int i=0;i<arr.length;i++){
            String shortStr = "";
            int shortLen = Integer.MAX_VALUE;

            for(String st : map.keySet()){
                if (arr[i].startsWith(st) && arr[i].length() > st.length() && map.get(st) < shortLen){
                shortStr = st;
                shortLen = map.get(st);
                }
            }
            if(!shortStr.isEmpty()){
                s+=shortStr+" ";
            }
            else{
                s+=arr[i]+" ";
            }
        }

        return s.trim();
    }
}