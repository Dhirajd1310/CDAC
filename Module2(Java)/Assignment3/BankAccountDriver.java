class BankAccount{
	private double balance;
	
	BankAccount(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	
	public void addDeposit(double amount){
		if(amount>0){
			balance+=amount;
			System.out.println("Deposited amount "+amount+" .Updated balance= "+balance);
		}else {
			System.out.println("Invalid deposit amount.");
		}
	}
	public void withdraw(double amount){
		if(amount > 0 && amount <= balance){
			balance -= amount;
			System.out.println("Withdraw amount "+amount+" .Updated balance= "+balance);
		}else {
			System.out.println("Insuffcient Balance Withdraw Failed!.");
		}
	}
	public void printAccountDetails(){
		 System.out.println("Updated Balance="+balance);
	}
}

class BankAccountDriver{
	public static void main(String[]args){
		BankAccount B1 = new BankAccount(5000.0d);
		B1.addDeposit(5000);
		B1.withdraw(2000);
		B1.printAccountDetails();
	}
}