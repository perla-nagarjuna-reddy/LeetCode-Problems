class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;

        for(int val : apple){
            sum = sum + val;
        }
        Arrays.sort(capacity);
        int count = 0;

        int rem = sum;

        for(int i=capacity.length - 1;i>=0;i--){
            if(rem <= capacity[i]){
                count++;
                break;
            }
            if(rem > capacity[i]){
                rem = rem - capacity[i];
                count++;
            }
        }

        return count;
    }
}