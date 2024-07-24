class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=9;i++){
            map.put(i,mapping[i]);
        }
        List<Pair> numPairs = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num = findingNumber(nums[i],map);
            System.out.println(num);
            numPairs.add(new Pair(nums[i], num));
        }
        numPairs.sort(Comparator.comparingInt(pair -> pair.mappedValue));
        int[] an = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            an[i] = numPairs.get(i).originalValue;
        }
        return an;
    }
    public int findingNumber(int num,HashMap<Integer,Integer> map){
        if (num == 0) return map.get(0); // handle the case for 0 specifically
        int mappedValue = 0;
        int multiplier = 1;
        while (num > 0) {
            int digit = num % 10;
            mappedValue += map.get(digit) * multiplier;
            multiplier *= 10;
            num /= 10;
        }
        return mappedValue;
    }
    private static class Pair {
        int originalValue;
        int mappedValue;

        Pair(int originalValue, int mappedValue) {
            this.originalValue = originalValue;
            this.mappedValue = mappedValue;
        }
    }
}
