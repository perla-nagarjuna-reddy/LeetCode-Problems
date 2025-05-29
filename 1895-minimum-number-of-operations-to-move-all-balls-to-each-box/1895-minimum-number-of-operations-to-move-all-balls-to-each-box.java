class Solution {
    public int[] minOperations(String boxes) {

        int n = boxes.length();

        int[] ans  = new int[n];

        char[] charArray = boxes.toCharArray();


        for(int i = 0 ; i < n; i++){

            int count = 0;

            for(int j = 0; j < n; j++){

                if(i == j) continue;

                if(charArray[j] == '1'){
                    count =  count + Math.abs(j - i);
                }
            }

            ans[i] = count;
        }


        return ans;
    }
}