class Solution {
    public List<String> cellsInRange(String s) {

        List<String> ans = new ArrayList<>();

        int n = s.length();

        int start = (int) s.charAt(0);

        int end = (int)s.charAt(n - 2);

        char digitChar = s.charAt(1);
        int startDigit = Character.getNumericValue(digitChar);
        char digitChar2 = s.charAt(n-1);
        int endDigit = Character.getNumericValue(digitChar2);
        
        for(int i = start; i <= end; i++){

            for(int j=startDigit; j <= endDigit; j++){
                String st = String.valueOf((char)i) + j;
                ans.add(st);
            }
        }

        return ans;
    }
}