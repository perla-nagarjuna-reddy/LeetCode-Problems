class Solution {
    public int getKth(int lo, int hi, int k) {

        int n = hi - lo + 1;

        int[] arr = new int[n];

        int[] nofOfSteps = new int[n];

        int ind  = 0;

        for(int i = lo; i <= hi; i++){

            int steps = 0;

            int num = i;

            while(num != 1){
                if(num % 2 == 0){
                    num = num / 2;
                }
                else{
                    num = 3 * num + 1;
                }
                steps++;
            }
            arr[ind] = i;
            nofOfSteps[ind] = steps;
            ind++;
        }

        List<int[]> pairList = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            pairList.add(new int[]{arr[i],nofOfSteps[i]});
        }

        pairList.sort((a,b) -> {

            if(a[1] != b[1]){
                return Integer.compare(a[1],b[1]);
            }
            else{
                return Integer.compare(a[0],b[0]);
            }
        });

        int[] temp = pairList.get(k-1);

        return temp[0];
    }
}