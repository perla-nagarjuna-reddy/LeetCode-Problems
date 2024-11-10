class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=lowLimit;i<=highLimit;i++){
            int box = calculate(i);
            map.put(box,map.getOrDefault(box,0)+1);
        }

        int max = Integer.MIN_VALUE;

        for(int val : map.keySet()){
            max = Math.max(map.get(val),max);
        }

        return max;
    }

    public int calculate(int num){
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum = sum + digit;

            num = num / 10; 
        }
        
        return sum;
    }
}