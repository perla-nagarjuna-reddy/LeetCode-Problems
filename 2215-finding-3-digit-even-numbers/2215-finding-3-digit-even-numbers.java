class Solution {
    public int[] findEvenNumbers(int[] digits) {
       

        int n = digits.length;
        Set<Integer> result = new TreeSet<>();

        for(int i = 0 ; i < n; i++){

            for(int j = 0; j < n; j++){

                if (j == i) continue;

                for(int k = 0; k < n; k++){
                    if(k == i || k == j) continue;

                    int digit1 = digits[i],digit2 = digits[j],digit3 = digits[k];

                    if(digit1 == 0) continue;

                    if(digit3 % 2 != 0) continue;


                    int num = digit1*100 + digit2*10+ digit3;

                    result.add(num);
                }
            }

        }
        return result.stream().mapToInt(Integer::intValue).toArray(); 
    }
}