class Solution {
    public void duplicateZeros(int[] arr) {
        if(arr.length == 0){
            return;
        }
        List<Integer> lst = new ArrayList<>();
        int k = 0;
        while(k <= arr.length-1){
            if(arr[k] == 0){
                lst.add(0); 
                if (lst.size() < arr.length) {
                    lst.add(0); 
                }
            }
            else{
                lst.add(arr[k]);
            }
            k++;
        }

        System.out.println(lst);
        int[] ans = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr[i] = lst.get(i);
        }
    }
}