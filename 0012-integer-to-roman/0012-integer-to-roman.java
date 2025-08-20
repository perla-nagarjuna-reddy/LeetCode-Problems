class Solution {
    public String intToRoman(int num) {
        
        ArrayList<Integer> lst = new ArrayList<>();

        int temp= num;

        while(temp > 0){

            lst.add(temp % 10);
            temp = temp / 10;
        }

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(9,"IX");
        map.put(100,"C");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(40,"XL");
        map.put(4,"IV");
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(90,"XC");



        Collections.reverse(lst);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < lst.size(); i++){

            int numb = lst.get(i) * (int)Math.pow(10,lst.size() - i - 1);

            int tem1 = lst.get(i);

            if(numb >= 1000){
                
                while(tem1 > 0){
                    sb.append(map.get(1000));
                    tem1--;
                }
                continue;
            }
            
            if(numb >= 100 ){

                if(tem1 == 4 || tem1 == 9){

                    if(tem1 == 4){
                        sb.append(map.get(400));
                        continue;
                    }
                    else{
                        sb.append(map.get(900));
                        continue;
                    }
                }
                if(numb >= 500){

                    if(numb == 500){
                        sb.append("D");
                    }
                    else{
                        int times = (numb - 500) / 100;
                        sb.append("D");
                        while(times > 0){
                            sb.append(map.get(100));
                            times--;
                        }

                    }
                }
                else if(numb < 500){
                    System.out.println(numb);
                    if(numb == 100){
                        sb.append(map.get(numb));
                    }
                    else{
                        int times = numb / 100;
                        System.out.println(times);
                        while(times > 0){
                            sb.append(map.get(100));
                            times--;
                        }
                    }
                }
            }

            if(numb >= 10 && numb <= 90){

                if(tem1 == 4 || tem1 == 9){

                    if(tem1 == 4){
                        sb.append(map.get(40));
                        continue;
                    }
                    else{
                        sb.append(map.get(90));
                        continue;
                    }
                }
                if(numb >= 50){

                    if(numb == 50){
                        sb.append("L");
                    }
                    else{
                        int times = (numb - 50) / 10;
                        sb.append("L");
                        while(times > 0){
                            sb.append(map.get(10));
                            times--;
                        }

                    }
                }
                else if(numb < 50){
                 
                    if(numb == 10){
                        sb.append(map.get(numb));
                    }
                    else{
                        int times = numb / 10;
                        System.out.println(times);
                        while(times > 0){
                            sb.append(map.get(10));
                            times--;
                        }
                    }
                }
            }

            if(numb <= 9){

                if(tem1 == 4 || tem1 == 9){

                    if(tem1 == 4){
                        sb.append(map.get(4));
                        continue;
                    }
                    else{
                        sb.append(map.get(9));
                        continue;
                    }
                }

                if(tem1 >= 5){


                    if(tem1 == 5){
                        sb.append(map.get(tem1));
                    }
                    else{
                        int times = tem1 - 5;
                        sb.append(map.get(5));
                        while(times > 0){
                            sb.append(map.get(1));
                            times--;
                        }
                    }
                }
                else{
                    if(tem1 == 1){
                        sb.append(map.get(tem1));
                    }
                    else{
                        int times = tem1;
                        while(times > 0){
                            sb.append(map.get(1));
                            times--;
                        }
                    }
                }
            }
        }

        return sb.toString();
    }
}