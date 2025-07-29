class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        
        int sum = 0;

        int count = 1;

        for(int i = 0; i < s.length(); i++){
            int width = widths[s.charAt(i) - 'a'];
            if(sum + width > 100){
                sum = width;
                count++;
            }
            else{
                sum = sum + width;
            }
        }

        return new int[]{count,sum};
    }
}