class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        
        for(int i=0;i<items.size();i++){
                        System.out.println(ruleKey);
                        System.out.println(ruleValue);


            System.out.println(items.get(i).get(0));
            
            System.out.println(items.get(i).get(1));

            System.out.println(items.get(i).get(2));

            
            if(ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0))){
                System.out.println("fdkhfds");
                count++;
            }
            else if(ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1))){
                System.out.println("fdkhfds");
                count++;
            }
            else if(ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))){
                System.out.println("fdkhfds");
                count++;
            }
                
        }
        return count;
    }
}