class Account extends Bank{
    public Account(String account_name ){
        super(account_name);
 }
 
 public void deposit(double cash_amount){
    if(cash_amount > 0){
        Balance += cash_amount;
        record_to_file("Deposited: " + cash_amount);
    }else{
        System.out.print("deposited amount must be greater than 0");
    }

    }
    public void withdraw(double cash_amount){
    if(cash_amount <= Balance){
        Balance -= cash_amount;
        record_to_file("Withdrew: " + cash_amount);
    }else{
        System.out.print("deposited amount must be greater than 0");
    }
}
    public double getbalance(){
       return Balance;
    
    }

    @Override
    public void deposit() {
       
        //throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }
    @Override
    public void withdraw() {
        //throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    };

   

}
