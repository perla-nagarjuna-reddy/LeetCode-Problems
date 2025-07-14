class Solution {
    public long dividePlayers(int[] skill) {
        
        Arrays.sort(skill);

        int i = 1; 
        
        int j  = skill.length - 2;

        long prev = skill[0] + skill[skill.length - 1];

        long sum = skill[0] * skill[skill.length - 1];

        while(i < j){

            long newSum = skill[i] + skill[j];

            if(newSum == prev){
                sum = sum + (skill[i] * skill[j]);
                prev = newSum;
            }
            else{
                return -1;
            }
            i++;
            j--;
        }

        return sum;
    }
}