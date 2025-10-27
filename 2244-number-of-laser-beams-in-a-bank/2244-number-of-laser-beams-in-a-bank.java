class Solution {
    public int numberOfBeams(String[] bank) {

        int[] arr = new int[bank.length];
        
        for (int i = 0; i < bank.length; i++){

            int count = 0;

            for(char ch : bank[i].toCharArray()){

                if(ch == '1'){
                    count++;
                }
            }
            arr[i] = count;
        }

        int prev = 0;

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] == 0){
                continue;
            }
            else{
                sum = sum + (prev * arr[i]);
                prev = arr[i];
            }
        }

        return sum;
    }
}