class Solution {
    public boolean checkString(String s) {
        if(s.length() == 1 && s.charAt(0) == 'a') return true;
        int lastA = s.lastIndexOf('a');
        int firstb = s.indexOf('b');
        if(firstb == -1) return true;
        if(lastA > firstb) return false;
        return true;
    }
}