class Solution {
    public int numDifferentIntegers(String word) {
        String[] ans = word.replaceAll("[a-zA-Z]", " ").split(" ");
        Set<String> set = new HashSet<>();
        for(int i=0; i < ans.length;i++){
            System.out.println(ans[i]);
            if (!ans[i].isEmpty()) {
                String normalized = ans[i].replaceFirst("^0+", "");
                if (normalized.isEmpty()) normalized = "0"; 
                set.add(normalized);
            }
        }

        return set.size();
    }
}