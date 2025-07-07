class Spreadsheet {
    HashMap<String,Integer> map;
    public Spreadsheet(int rows) {
        map = new HashMap<>();
    }
    
    public void setCell(String cell, int value) {

        map.put(cell,value);
    }
    
    public void resetCell(String cell) {
        map.put(cell,0);
    }
    
    public int getValue(String formula) {
        String[] parts = formula.substring(1).split("\\+");
        int val1 = isNumeric(parts[0]) ? Integer.parseInt(parts[0]) : map.getOrDefault(parts[0], 0);
        int val2 = isNumeric(parts[1]) ? Integer.parseInt(parts[1]) : map.getOrDefault(parts[1], 0);

        return val1 + val2;
    }

    // Helper method to check if a string is a number
    private boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */