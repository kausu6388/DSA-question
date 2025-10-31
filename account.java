class account {
    private double balance;
    public void deposit(double amount) {
        if(amount<=0){
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount  );
       
    }
    public void withdraw(double amount) {
        if(amount<=0){
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        else if(amount > balance){
            throw new IllegalArgumentException("Insufficient balance.");
        }
        else {balance -= amount;
        System.out.println("Withdrew: " + amount );
        }
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        account myAccount = new account();
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        System.out.println("Current Balance: " + myAccount.getBalance());
    } 
    
}
