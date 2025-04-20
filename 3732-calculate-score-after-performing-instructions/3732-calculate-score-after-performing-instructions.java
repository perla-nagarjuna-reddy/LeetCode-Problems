class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        Set<Integer> set = new HashSet<>();

        if(instructions.length  == 1 && instructions[0].equals("add")){
            return values[0];
        }

        if(instructions.length  == 1 && instructions[0].equals("jump")){
            return 0;
        }


        long ans = 0;

        int n = instructions.length;

        int i = 0;

        while ((i >= 0 && i < n) && !set.contains(i)) {

            set.add(i);

            if (instructions[i].equals("add")) {
                ans += values[i];
                i++;
            }
            else if (instructions[i].equals("jump")) {
                i += values[i];
            }
            else {
                throw new IllegalArgumentException("Invalid instruction: " + instructions[i]);
            }
        }
        return ans;
    }
}