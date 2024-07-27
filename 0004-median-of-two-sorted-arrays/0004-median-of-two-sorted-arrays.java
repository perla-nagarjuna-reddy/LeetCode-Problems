class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length+nums2.length;
        int ind2 = n / 2;
        int ind1= ind2-1;
        int ele1 = -1;
        int ele2 = -1;
        int i=0;
        int j=0;
        int cnt = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                if(cnt == ind1) ele1=nums1[i];
                if(cnt == ind2) ele2=nums1[i];
                i++;
                cnt++;
            }
            else{
                if(cnt == ind1) ele1=nums2[j];
                if(cnt == ind2) ele2=nums2[j];
                j++;
                cnt++;
            }
        }

        while(i < nums1.length){
            if(cnt == ind1) ele1=nums1[i];
            if(cnt == ind2) ele2=nums1[i];
            i++;
            cnt++;
        }
        while(j < nums2.length){
            if(cnt == ind1) ele1=nums2[j];
            if(cnt == ind2) ele2=nums2[j];
            j++;
            cnt++;
        }

        if(n % 2 == 1) return ele2;
        return (double)(ele1+ele2) / 2.0;
    }
}