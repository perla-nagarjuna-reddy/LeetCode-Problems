class Solution {
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);

        int low = 1;

        int high = position[position.length - 1] - position[0];
        
        int ans = 0;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(canPlaceABall(position,mid,m)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return ans;
    }

    public boolean canPlaceABall(int[] position,int minDist,int balls){

        int count = 1;

        int prevPlaced = position[0];

        for(int i = 1; i < position.length; i++){

            if(position[i] - prevPlaced >= minDist){

                count++;

                prevPlaced = position[i];

                if(count >= balls){
                    return true;
                }
            }
        }

        return false;
    }
}