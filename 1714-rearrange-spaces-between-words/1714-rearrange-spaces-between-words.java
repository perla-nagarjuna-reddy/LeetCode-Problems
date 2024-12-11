class Solution {
    public String reorderSpaces(String text) {
        int count = 0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == ' '){
                count++;
            }
        }
        if(count == 0){
            return text;
        }
        String[] arr = text.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        if(arr.length == 1){
            sb.append(arr[0]);
            for(int i=0;i<count;i++){
                sb.append(" ");
            }
            return sb.toString();
        }
        int spaces = count / (arr.length - 1);
        int rem = count % (arr.length - 1);
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            if(i != arr.length - 1){
                for(int j=0;j<spaces;j++){
                    sb.append(" ");
                }
            }
        }
        for (int i = 0; i < rem; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}