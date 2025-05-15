class Solution {
    public String validIPAddress(String queryIP) {

        boolean isIpv4 = checkIPv4(queryIP);

        if(isIpv4) return "IPv4";

        boolean isIpv6 = checkIPv6(queryIP);

        if(isIpv6) return "IPv6";

        return "Neither";
    }

    boolean checkIPv4(String queryIP){

        if (queryIP.contains(":") || queryIP.startsWith(".") || queryIP.endsWith(".")) {
            return false;
        }
        
        String[] arr = queryIP.split("\\.");

        if (arr.length != 4) return false;

        for(int i = 0; i < arr.length; i++){

            if(arr[i].length() == 0) return false;

            for (char c : arr[i].toCharArray()) {
                if (Character.isLetter(c)) {
                    return false;
                }
            }

            if(arr[i].length() > 1 && arr[i].charAt(0) == '0'){
                return false;
            }

            if(!arr[i].matches("[0-9]*")){
                return false;
            }

            try {
            int num = Integer.parseInt(arr[i]);
            if (num < 0 || num > 255) return false;

            } catch (NumberFormatException e) {
                return false;
            }


            if (arr[i].length() > 1 && (arr[i].startsWith("0") || arr[i].startsWith("00") || arr[i].equals("000"))) {
                return false;
            }
        }

        return true;
    }

    boolean checkIPv6(String queryIP){

        if (queryIP.contains(".") || queryIP.startsWith(":") || queryIP.endsWith(":")) {
            return false;
        }

        String[] arr = queryIP.split(":");

        System.out.println(Arrays.toString(arr));

        if (arr.length != 8) return false;

        for(int i = 0 ; i < arr.length; i++){

            if(arr[i].length() == 0 || arr[i].length() > 4) return false;

            if(!arr[i].matches("[0-9a-fA-F]+")) return false;
        }

        return true;
    }
}