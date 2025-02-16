class Solution {
    public String convertToBase7(int num) {

        if(num == 0){
            return "0";
        }
        List<Integer> res = new ArrayList<>();

        int number = Math.abs(num) ;

        while (number > 0){
            res.add(number % 7);
            number = number / 7;
        }
        Collections.reverse(res);

        StringBuilder sb = new StringBuilder();

        for(int val : res){
            sb.append(val);
        }

        if(num < 0){
            sb.insert(0,"-");
        }
        return sb.toString();
    }
}