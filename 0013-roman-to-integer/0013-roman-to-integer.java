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
            System.out.println(val);
            if(i < s.length()-1 && String.valueOf(s.charAt(i)).equals("I") && String.valueOf(s.charAt(i+1)).equals("V")){
                sum+=4;
                i+=1;
                // System.out.println(val);
            }

            else if(i < s.length()-1 && String.valueOf(s.charAt(i)).equals("I") && String.valueOf(s.charAt(i+1)).equals("X")){
                // System.out.println(val);
                sum+=9;
                i+=1;
            }
            else if(i < s.length()-1 && String.valueOf(s.charAt(i)).equals("X") && String.valueOf(s.charAt(i+1)).equals("L")){
                // System.out.println(val);
                sum+=40;
                i+=1;
            }
            else if(i < s.length()-1 && String.valueOf(s.charAt(i)).equals("X") && String.valueOf(s.charAt(i+1)).equals("C")){
                // System.out.println(val);
                sum+=90;
                i+=1;
            }
            else if(i < s.length()-1 && String.valueOf(s.charAt(i)).equals("C") && String.valueOf(s.charAt(i+1)).equals("D")){
                // System.out.println(val);
                sum+=400;
                i+=1;
            }
            else if(i < s.length()-1 && String.valueOf(s.charAt(i)).equals("C") && String.valueOf(s.charAt(i+1)).equals("M")){
                // System.out.println(val);
                sum+=900;
                // System.out.println(sum +" " + val);
                i+=1;
            }
            else{
                
                sum+=map.get(val);
                // System.out.println(val);
            }
           

        }

        return sum;
    }
}