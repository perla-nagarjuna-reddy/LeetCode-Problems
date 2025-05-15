class Solution {
    public boolean strongPasswordCheckerII(String password) {

        boolean isUpper = false;

        boolean isLower = false;

        boolean isDigit = false;

        boolean isSpecial = false;

        if(password.length() < 8) return false;

        String special = "!@#$%^&*()-+";

        for(int i = 0; i < password.length(); i++){

            char ch = password.charAt(i);

            if(i < password.length() - 1 && password.charAt(i) == password.charAt(i+1)){
                return false;
            }

            if(!isDigit && Character.isDigit(ch)){
                isDigit = true;
            }
            else if(!isUpper && Character.isUpperCase(ch)){
                isUpper = true;
            }
            else if(!isLower && Character.isLowerCase(ch)){
                isLower = true;
            }
            else if(!isSpecial && (ch == 94 || ch == 63 || ch == 64 || (ch - '!' >= 0 && ch - '!' < 13))){
                isSpecial = true;
            }
        }



        return isDigit && isUpper && isLower && isSpecial;
    }
}