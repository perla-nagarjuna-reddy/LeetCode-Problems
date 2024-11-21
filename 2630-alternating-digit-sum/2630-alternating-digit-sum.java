class Solution {
    public int alternateDigitSum(int n) {
        List<Integer> lst = new ArrayList<>();

        int temp = n;

        while(temp > 0){
            lst.add(0,temp % 10);
            temp = temp / 10;
        }

        int sum = 0;

        for(int i=0;i<lst.size();i++){
            if(i % 2 == 1){
                sum = sum + (-1)*lst.get(i);
            }
            else{
                sum = sum + lst.get(i);
            }
        }

        return sum;
    }
}