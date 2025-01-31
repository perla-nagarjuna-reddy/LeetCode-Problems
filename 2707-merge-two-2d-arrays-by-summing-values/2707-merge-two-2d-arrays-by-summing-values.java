class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums1.length;
        int m = nums1[0].length;

        for(int i=0;i<n;i++){
            int num = nums1[i][0];
            int val = nums1[i][1];
            map.put(num,map.getOrDefault(num,0)+val);
        }
        n = nums2.length;
        for(int i=0;i<n;i++){
            int num = nums2[i][0];
            int val = nums2[i][1];
            map.put(num,map.getOrDefault(num,0)+val);
        }

        int[][] ans = new int[map.size()][2];
        int k = 0;
        for(int key : map.keySet()){
            int[] temp = new int[2];
            temp[0] = key;
            temp[1] = map.get(key);
            ans[k++] = temp;
        }
        Arrays.sort(ans, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        return ans;
    }
}