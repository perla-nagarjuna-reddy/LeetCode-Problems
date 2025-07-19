class Solution {
    public List<String> removeSubfolders(String[] folder) {
        
        List<String> st = new ArrayList<>();

        Arrays.sort(folder);

        String prev = folder[0];
        
        st.add(prev);

        for(int i = 1; i < folder.length; i++){

            if(folder[i].startsWith(prev+"/")){
                continue;
            }
            else{
                st.add(folder[i]);
                prev = folder[i];
            }
        }

        return st;

    }
}