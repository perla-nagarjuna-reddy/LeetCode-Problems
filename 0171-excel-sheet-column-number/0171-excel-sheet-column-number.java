class Solution {
    public int titleToNumber(String columnTitle) {

        int num = 1;

        int n = columnTitle.length();
        int j = 0;
        for(int i = n - 1; i >= 0; i--){
            int pos = (int)(columnTitle.charAt(j++) - 'A')+1;
            System.out.println(pos);
            num = num + (pos * (int)Math.pow(26,i));
        }

        return num - 1;
    }
}