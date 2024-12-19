class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String a = s.substring(0,s.length() / 2);
        String b = s.substring(s.length() / 2);

        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i','o','u'));

        int count = 0;

        int count1 = 0;

        for(int i=0;i<s.length() / 2;i++){
            if(set.contains(a.charAt(i))){
                count++;
            }
            if(set.contains(b.charAt(i))){
                count1++;
            }
        }

        return (count == count1)?true:false;
        
    }
}