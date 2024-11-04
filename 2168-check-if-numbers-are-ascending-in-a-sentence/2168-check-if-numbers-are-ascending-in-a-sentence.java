import java.util.*;
class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int sum = 0;
        List<Integer> lst = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i].charAt(0))){
                lst.add(Integer.valueOf(arr[i]));
            }
        }
        int prev = lst.get(0);
        System.out.println(lst);
        for(int i=1;i<lst.size();i++){
            if(lst.get(i) <= prev){
                return false;
            }
            prev = lst.get(i);
        }

        return true;
    }
}