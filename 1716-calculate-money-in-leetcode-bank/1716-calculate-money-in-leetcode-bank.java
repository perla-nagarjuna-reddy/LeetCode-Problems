class Solution {
    public int totalMoney(int n) {
        int money = 0;      // Total money in the bank
        int price = 1;      // Amount put in on the current day
        int newcash = 1;    // Amount put in on the next Monday
        int days = 1;       // Current day

        // Loop until the nth day
        while (days <= n) {
            // Check if the current day is a Monday (multiple of 7)
            if (days % 7 == 0) {
                money += price;   // Add the amount to the total money
                days++;           // Increment the day
                newcash++;        // Increment newcash
                price = newcash;  // Update price to the new value
            }

            // Check if the current day is within the limit (less than or equal to n)
            if (days <= n) {
                money += price;   // Add the amount to the total money
                price++;          // Increment price
                days++;           // Increment the day
            }
        }
        
        return money;
    }
}