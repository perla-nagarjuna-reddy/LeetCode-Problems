class Solution {
    public int divisorSubstrings(int num, int k) {
        String numStr = String.valueOf(num); // Convert the number to a string
        int kBeauty = 0; // Counter for the k-beauty

        for (int i = 0; i <= numStr.length() - k; i++) {
            // Extract substring of length k
            String subStr = numStr.substring(i, i + k);

            // Convert substring to an integer
            int subNum = Integer.parseInt(subStr);

            // Check divisibility and ensure subNum is not zero
            if (subNum != 0 && num % subNum == 0) {
                kBeauty++;
            }
        }

        return kBeauty; // Return the k-beauty
    }
}
