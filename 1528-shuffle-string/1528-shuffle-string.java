class Solution {
    public String restoreString(String s, int[] indices) {
        char a[]=new char[indices.length];        
        String o="";
        for(int i=0;i<indices.length;i++)
        {
            a[indices[i]]=s.charAt(i);            
        }
        for(char i:a)
        {
            o+=i;
        }
        return o;
    }
}