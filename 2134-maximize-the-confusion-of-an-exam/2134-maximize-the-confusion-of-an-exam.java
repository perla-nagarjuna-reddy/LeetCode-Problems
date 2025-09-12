class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(solve(answerKey,'T',k),solve(answerKey,'F',k));
    }

    public int solve(String answerKey,char ch,int k){
        int low = 0;

        int high = 0;

        int count = 0;

        int max = Integer.MIN_VALUE;

        while(high < answerKey.length()){

            if(answerKey.charAt(high) == ch){
                count++;
            }

            while(count > k){

                if(answerKey.charAt(low) == ch){
                    count--;
                }
                low++;
            }

            max = Math.max(high - low + 1, max);
            
            high++;
        }
        return max;
    }
}