class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Arrays.sort(products);

        List<List<String>> ans = new ArrayList<>();
        
        for(int i = 0; i < searchWord.length(); i++){

            String st = searchWord.substring(0,i+1);

            List<String> lst = new ArrayList<>();

            for(int k = 0; k < products.length;k++){

                if(products[k].startsWith(st) && lst.size() < 3){
                    lst.add(products[k]);
                }
            }

            ans.add(lst);
        }

        return ans;
    }
}