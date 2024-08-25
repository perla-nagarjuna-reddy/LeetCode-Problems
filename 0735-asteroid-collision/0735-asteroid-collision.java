class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if (arr[i] > 0 || s.isEmpty()){
                s.push(arr[i]);
            } 
            else{
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(arr[i])){
                    
                    s.pop();
                }
                if(!s.isEmpty() && s.peek() == Math.abs(arr[i])){
                   
                    s.pop();
                } 
                else{
                    if (s.isEmpty() || s.peek() < 0){
                        s.push(arr[i]);
                    }
                }
            }
        }
        int[] ans = new int[s.size()];
        for(int i=s.size()-1;i>=0;i--){
            ans[i] = s.pop();
        }

        return ans;
    }
}