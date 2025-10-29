class Solution {
    public int smallestNumber(int n) {

        int start = n; 

        while(true){

            List<Integer> lst = new ArrayList<>();

            int temp = start;

            boolean isBitSet = true;

            while(temp != 1){
                
                lst.add(temp % 2);

                temp = temp / 2;
            }
            for(int val : lst){

                if(val == 0){
                    isBitSet = false;
                }
            }

            if(isBitSet){
                break;
            }

            start++;
        }

        return start;
    }
}