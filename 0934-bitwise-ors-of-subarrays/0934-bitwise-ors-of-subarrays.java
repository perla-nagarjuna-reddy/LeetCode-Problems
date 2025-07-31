class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> prev = new HashSet<>();
        for (int start = 0; start < arr.length; start++) {
            Set<Integer> curr = new HashSet<>();
            curr.add(arr[start]);
            for (int x : prev) {
                curr.add(arr[start] | x);
            }

            prev = curr;

            set.addAll(curr);
        }

        return set.size();
    }
}