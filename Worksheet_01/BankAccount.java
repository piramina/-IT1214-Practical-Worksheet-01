class BankAccount{
	private String accountHolderName;
	private double balance;
	
	public void setAccountHolderName(String name){
		this.accountHolderName=name;
	}
	
	public void deposit(double amount){
		if(amount>0)
			balance+=amount;
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance)
			balance-=amount;
		else
			System.out.println("Insufficient balance or invalid amount!");
	}
	
	public void displayBalance() {
		System.out.println("Balance: " + balance);
	}
}