class Solution {
    public int generateKey(int num1, int num2, int num3) {
        
        StringBuilder sb1 = new StringBuilder(String.valueOf(num1));
                
        StringBuilder sb2 = new StringBuilder(String.valueOf(num2));

        StringBuilder sb3 = new StringBuilder(String.valueOf(num3));


        if(sb1.length() < 4){
            int size = sb1.length();
            
            int pad = 4 - size;

            for(int i = 0; i < pad; i++){
                sb1.insert(0,"0");
            }
        }
        if(sb2.length() < 4){
            int size = sb2.length();
            
            int pad = 4 - size;

            for(int i = 0; i < pad; i++){
                sb2.insert(0,"0");
            }
        }
        if(sb3.length() < 4){
            int size = sb3.length();
            
            int pad = 4 - size;

            for(int i = 0; i < pad; i++){
                sb3.insert(0,"0");
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < sb1.length(); i++){

            int val1 = Character.getNumericValue(sb1.charAt(i));

            int val2  = Character.getNumericValue(sb2.charAt(i));

            int val3  = Character.getNumericValue(sb3.charAt(i));

           

            int firstMin = Math.min(val1,val2);

            int secondMin = Math.min(firstMin,val3);

            sb.append(secondMin);
        }

        return Integer.valueOf(sb.toString());
    }
}