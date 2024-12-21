class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for(int i=low;i<=high;i++){
            String s = String.valueOf(i);
            if (s.length() % 2 == 0) {
                int mid = s.length() / 2;
                int firstHalf = sumOfDigits(s.substring(0, mid));
                int secondHalf = sumOfDigits(s.substring(mid));
                if (firstHalf == secondHalf) {
                    count++;
                }
            }
        }

        return count;
    }

    public int sumOfDigits(String s){
        int sum = 0;

        for (char c : s.toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        return sum;
    }
}