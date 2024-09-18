class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //Modification 1: cnt variable to count the pairs:
        // int cnt = 0;

        //storing elements in the temporary array in a sorted manner//
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                // cnt += (mid - left + 1); //Modification 2
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt+=mergeSort(arr, low, mid);  // left half
        cnt+=mergeSort(arr, mid + 1, high); // right half
        cnt+=countPairs(arr,low,mid,high);
        merge(arr, low, mid, high);  // merging sorted halves
        return cnt;
    }

    public static int countPairs(int[] arr,int low,int mid,int high){
        int right = mid + 1;
        int count = 0;
        for(int i=low;i<=mid;i++){

            while(right <= high && (long)arr[i] > (long)2 * arr[right]){
                right++;
            }
            count+=(right - (mid+1));
        }

        return count;
    }
}