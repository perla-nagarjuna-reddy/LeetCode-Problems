class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Parse dates for Alice and Bob
        int aliceStart = dateToDayOfYear(arriveAlice,daysInMonth);
        int aliceEnd = dateToDayOfYear(leaveAlice,daysInMonth);
        int bobStart = dateToDayOfYear(arriveBob,daysInMonth);
        int bobEnd = dateToDayOfYear(leaveBob,daysInMonth);

        // Find the overlap start and end
        int overlapStart = Math.max(aliceStart, bobStart);
        int overlapEnd = Math.min(aliceEnd, bobEnd);
        return Math.max(0, overlapEnd - overlapStart + 1);
    }

    public int dateToDayOfYear(String date,int[] daysInMonth) {
        String[] parts = date.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        int dayOfYear = day;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        return dayOfYear;
    }
}