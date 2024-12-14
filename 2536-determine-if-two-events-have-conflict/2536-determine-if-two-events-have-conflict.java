class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int startTime = Integer.valueOf(event1[0].substring(0,2))*60 + Integer.valueOf(event1[0].substring(3));
        int endTime = Integer.valueOf(event1[1].substring(0,2))*60 + Integer.valueOf(event1[1].substring(3));
        int startTime1 = Integer.valueOf(event2[0].substring(0,2))*60 + Integer.valueOf(event2[0].substring(3));
        int endTime1 = Integer.valueOf(event2[1].substring(0,2))*60 + Integer.valueOf(event2[1].substring(3));
    
        return !(endTime < startTime1 || endTime1 < startTime);

    }
}