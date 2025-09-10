class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        
        List<int[]> noCommon = new ArrayList<>();

        for(int  i = 0; i < friendships.length; i++){

            int ui = friendships[i][0];

            int vi = friendships[i][1];

            Set<Integer> set = new HashSet<>();

            for(int val : languages[ui - 1]){
                set.add(val);
            }

            boolean isFound = false;

            for(int val : languages[vi - 1]){

                if(set.contains(val)){
                    isFound = true;
                    break;
                }
            }

            if(!isFound){
                noCommon.add(friendships[i]);
            }
        }

        if (noCommon.isEmpty()) return 0;

        int min = Integer.MAX_VALUE;

        for(int i = 1; i <= n; i++){

            Set<Integer> set = new HashSet<>();

            for(int[] arr : noCommon){

                int[] userX = languages[arr[0] - 1];

                int[] userY = languages[arr[1] - 1];

                boolean isFound = false;

                boolean isFound1 = false;
                for(int val : userX){

                    if(val == i){
                        isFound = true;
                        break;
                    }

                }

                for(int val : userY){

                    if(val == i){
                        isFound1 = true;
                        break;
                    }
                }

                if(isFound && isFound1){
                    continue;
                }

                if (!isFound){
                    set.add(arr[0]);
                }
                
                if(!isFound1){
                    set.add(arr[1]);
                }
            }

            min = Math.min(min,set.size());

        }

        return min;
    }
}