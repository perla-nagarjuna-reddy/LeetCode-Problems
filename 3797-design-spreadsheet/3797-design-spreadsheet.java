class Spreadsheet {
    HashMap<String,Integer> map;
    public Spreadsheet(int rows) {
        map = new HashMap<>();

        for(char ch='A'; ch <= 'Z'; ch++){

            for(int i = 1; i <= rows; i++){

                String st = String.valueOf(ch) + i;

                map.put(st,0);
            }
        }
    }
    
    public void setCell(String cell, int value) {

        if(map.containsKey(cell)){
            map.put(cell,value);
        }
    }
    
    public void resetCell(String cell) {

        if(map.containsKey(cell)){
            map.put(cell,0);
        }
    }
    
    public int getValue(String formula) {
        String[] parts = formula.substring(1).split("\\+");
        int val1 = map.containsKey(parts[0]) ? map.get(parts[0]) : Integer.parseInt(parts[0]);
        int val2 = map.containsKey(parts[1]) ? map.get(parts[1]) : Integer.parseInt(parts[1]);
        return val1 + val2;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */