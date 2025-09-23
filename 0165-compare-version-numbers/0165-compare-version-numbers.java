class Solution {
    public int compareVersion(String version1, String version2) {

        String[] arr = version1.split("\\.") ;
        String[] arr1 = version2.split("\\.") ;

        int n = Math.max(arr.length, arr1.length);

        for(int i = 0; i < n ; i++){

            int ver1  = i < arr.length ? Integer.valueOf(arr[i]) : 0;

            int ver2 = i < arr1.length ? Integer.valueOf(arr1[i]) : 0;

            if(ver1 > ver2) return 1;

            if(ver1 < ver2) return -1;
        }

        return 0;
    }
}