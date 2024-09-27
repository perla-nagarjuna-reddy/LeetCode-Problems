class Solution {
    public int dayOfYear(String date) {
        int[] monthArr = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] LeapmonthArr = {31,29,31,30,31,30,31,31,30,31,30,31};
        int year = Integer.valueOf(date.substring(0,4));
        int month = Integer.valueOf(date.substring(5,7));
        int day = Integer.valueOf(date.substring(8,date.length()));
        int totalDays = 0;
        if(!checkLeapYearOrNot(year)){
            if(month == 1){
                return day;
            }
            else{
                for(int i=0;i<month-1;i++){
                    totalDays += monthArr[i];
                }

                totalDays+=day;
                
            }
        }
        else{
            if(month == 1) return day;
            for(int i=0;i<month-1;i++){
                totalDays += LeapmonthArr[i];
            }

            totalDays+=day;
        }

        return totalDays;

    }
    public boolean checkLeapYearOrNot(int year){
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) leap = true;
                else leap = false;
            }
            else{
                leap = true;
            }
        }
        else{
            leap = false;
        }

        return leap;
    }
}