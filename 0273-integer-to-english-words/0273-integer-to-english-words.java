class Solution {
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");
        map.put(100, "Hundred");

        StringBuilder ans = new StringBuilder();
        
        String[] thousands = {"", "Thousand", "Million", "Billion"};

        StringBuilder result = new StringBuilder();

        int groupIndex = 0;

        while (num > 0) {
            int part = num % 1000;

            if (part != 0) {
                StringBuilder sb = new StringBuilder();

                int hundreds = part / 100;
                int tensOnes = part % 100;

                if (hundreds > 0) {
                    sb.append(map.get(hundreds)).append(" Hundred ");
                }

                if (tensOnes > 0) {
                    if (tensOnes < 20) {
                        sb.append(map.get(tensOnes)).append(" ");
                    } else {
                        int tens = (tensOnes / 10) * 10;
                        int ones = tensOnes % 10;

                        sb.append(map.get(tens)).append(" ");
                        if (ones > 0) {
                            sb.append(map.get(ones)).append(" ");
                        }
                    }
                }

                if (!thousands[groupIndex].isEmpty()) {
                    sb.append(thousands[groupIndex]).append(" ");
                }

                ans.insert(0, sb.toString());
            }

            num /= 1000;      

            groupIndex++;
        }

        return ans.toString().trim();
        
    }
}