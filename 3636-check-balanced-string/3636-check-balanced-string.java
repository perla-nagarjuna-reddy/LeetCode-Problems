class Solution {
    public boolean isBalanced(String num) {

        if(num.length() < 2){
            return false;
        }
        int evenInd = 0;
        int oddInd = 0;

        for(int i=0;i<num.length();i++){
            if(i % 2 == 0){
                evenInd = evenInd + (num.charAt(i) - 48);
            }
            else{
                oddInd = oddInd + (num.charAt(i) - 48);
            }
        }
        return evenInd == oddInd?true:false;
    }
}