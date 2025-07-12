class Bank {

    long[] bal;
    int n = 0;

    public Bank(long[] balance) {
        bal = balance;
        n = balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {

        boolean isValid = checkValidAccount(account1,account2);

        if(!isValid) return false;

        long acctBal1 = bal[account1 - 1];

        long acctBal2 = bal[account2 - 1];


        if(money > acctBal1) return false;

        if (account1 == account2) return true;

        acctBal1 = acctBal1 - money;
        acctBal2 = acctBal2 + money;

        bal[account1 - 1] = acctBal1;
        bal[account2 - 1] = acctBal2;

        return true;

    }
    
    public boolean deposit(int account, long money) {

        boolean isValid = checkValidAccount(account);

        if(!isValid) return false;

        bal[account - 1]+=money;

        return true;


    }
    
    public boolean withdraw(int account, long money) {
        boolean isValid = checkValidAccount(account);

        if(!isValid) return false;

        long acctBal = bal[account - 1];

        if(money > acctBal) return false;

        bal[account - 1]-=money;

        return true;
    }

    public boolean checkValidAccount(int account){

        return (account >= 1 && account <= n) ? true:false;
    }
    public boolean checkValidAccount(int acct1,int acct2){
        return (acct1 >= 1 && acct1 <= n) && (acct2 >= 1 && acct2 <= n) ?true:false;
    }

    
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */