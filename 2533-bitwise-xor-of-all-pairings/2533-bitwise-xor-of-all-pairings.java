class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ans = 0;


        // for(int i = 0 ; i < nums1.length; i++){

        //     for(int j = 0; j < nums2.length;j++){
        //         int bit = nums1[i] ^ nums2[j];
        //         ans = ans ^ bit;
        //     }
        // }


        int xor = 0;

        for(int val : nums1){
            xor^=val;
        }

        int xor1 = 0;

        for(int val : nums2){
            xor1^=val;
        }

        int ans1 = 0;

        int ans2 = 0;

        
        for(int i = 0 ; i < nums2.length; i++){
            ans1 = ans1 ^ xor;
        }

        for(int i = 0 ; i < nums1.length; i++){
            ans2 = ans2 ^ xor1;
        }

        return (ans1 ^ ans2);
    }
}