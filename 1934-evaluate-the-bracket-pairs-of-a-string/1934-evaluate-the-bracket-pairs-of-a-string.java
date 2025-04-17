class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();

        for(List<String> ls : knowledge){
            String key = ls.get(0);
            String value = ls.get(1);
            map.put(key,value);
        }

        StringBuilder sb = new StringBuilder();

        int open = 0;
        int startPos = 0;
        for(int i = 0 ; i < s.length();i++){

            if(s.charAt(i) == '('){
                open++;
                startPos = i;
            }

            if(open == 1 && s.charAt(i) == ')'){
                String st = s.substring(startPos+1,i);
                if(map.containsKey(st)){
                    sb.append(map.get(st));
                }
                else{
                    sb.append("?");
                }
                open--;
            }

            if(open == 0  && s.charAt(i) != ')'){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}