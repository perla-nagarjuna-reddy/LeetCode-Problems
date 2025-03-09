class Solution {
    public String convertToTitle(int columnNumber) {
        char[] alphaBets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        int num = columnNumber;
        int remainder = 0;
        List<Integer> lst = new ArrayList<>();

        while(num > 0 ){
            num--;
            lst.add(num % 26);
            num = num / 26;
        }

        Collections.reverse(lst);
        StringBuilder sb = new StringBuilder();
        System.out.println(lst);
        for(int i = 0 ; i < lst.size(); i++){
            sb.append(alphaBets[lst.get(i)]);
        }

        return sb.toString();
    }
}