class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;
        for(int i = 1 ; i <= n ; i++){
            int num = i * i;
            List<String> res = new ArrayList<>();
            if(do_backtracking(0,String.valueOf(num),res,i)){
                ans = ans + num;
            }
        }
        return ans;
    }

     public boolean do_backtracking(int index, String s, List<String> res, int num) {
        if (index == s.length()) {
            int sum = 0;
            for (String w : res) {
                if (!w.isEmpty()) {
                    sum += Integer.parseInt(w);
                }
            }
            return sum == num;
        }
        
        for (int i = index; i < s.length(); i++) {
            res.add(s.substring(index, i + 1));
            if (do_backtracking(i + 1, s, res, num)) {
                return true;
            }
            res.remove(res.size() - 1);
        }
        return false;
    }
}