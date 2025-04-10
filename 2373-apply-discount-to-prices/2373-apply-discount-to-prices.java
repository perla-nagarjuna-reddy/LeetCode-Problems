class Solution {
    public String discountPrices(String sentence, int discount) {
        StringBuilder sb = new StringBuilder();

        String[] words = sentence.split(" ");

        for(int i = 0; i < words.length; i++){

            if(isValidPrice(words[i])){

                long num = Long.valueOf(words[i].substring(1));
                double dis = num * ((double)(100 - discount) / 100);
                DecimalFormat df = new DecimalFormat("0.00");
                
                sb.append("$"+String.valueOf(df.format(dis))+" ");       
            }
            else{
                sb.append(words[i]+" ");
            }
        }

        return  sb.toString().trim();
    }
    public static boolean isValidPrice(String s) {
        return s.matches("^\\$\\d+$");
    }
}