class MyCalendar {

    List<int[]> lst;

    public MyCalendar() {
        lst = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {

        for(int[] arr : lst){

            int st = arr[0];

            int end = arr[1];

            if(startTime < end && endTime > st){
                return false;
            }
        }

        lst.add(new int[]{startTime,endTime});

        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */