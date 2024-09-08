class Solution {
    public String convertDateToBinary(String date) {
        String arr[] = date.split("-");
        String year = DecimalToBinary(Integer.valueOf(arr[0]));
        String month = DecimalToBinary(Integer.valueOf(arr[1]));
        String day = DecimalToBinary(Integer.valueOf(arr[2]));
        return year+"-"+month+"-"+day;
    }
    public String DecimalToBinary(int num){
        String st = "";

        while(num > 0){
            int rem = num % 2;
            st=rem+st;
            num = num/2;
        }
        return st;
    }
}