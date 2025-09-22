class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int sum = 0;
        for(int i=0;i<s.length();i++){
            String val = String.valueOf(s.charAt(i));

            if(i < s.length()-1 && String.valueOf(s.charAt(i)).equals("I") && String.valueOf(s.charAt(i+1)).equals("V")){
                sum+=4;
                i+=1;

            }

            else if(i < s.length()-1 && String.valueOf(s.charAt(i)).equals("I") && String.valueOf(s.charAt(i+1)).equals("X")){
   
                sum+=9;
                i+=1;
            }
            else if(i < s.length()-1 && String.valueOf(s.charAt(i)).equals("X") && String.valueOf(s.charAt(i+1)).equals("L")){
            
                sum+=40;
                i+=1;
            }
            else if(i < s.length()-1 && String.valueOf(s.charAt(i)).equals("X") && String.valueOf(s.charAt(i+1)).equals("C")){
          
                sum+=90;
                i+=1;
            }
            else if(i < s.length()-1 && String.valueOf(s.charAt(i)).equals("C") && String.valueOf(s.charAt(i+1)).equals("D")){
               
                sum+=400;
                i+=1;
            }
            else if(i < s.length()-1 && String.valueOf(s.charAt(i)).equals("C") && String.valueOf(s.charAt(i+1)).equals("M")){

                sum+=900;

                i+=1;
            }
            else{
                
                sum+=map.get(val);
            }
           

        }

        return sum;
    }
}