class BankAccountInfo{
	private String name;
	private double balance;
	

	
	BankAccountInfo(String name,double balance){
		this.name=name;
		this.balance=balance;
	}
	
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public void printAccountDetails(){
		 System.out.println("Name="+name+", Balance="+balance);
	}
	
	public void addDeposit(double amount){
		if(amount>0){
			balance+=amount;
			System.out.println(name+" deposited "+amount+" .Updated balance= "+balance);
		}else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdraw(double amount){
		if(amount > 0 && amount <= balance){
			balance -= amount;
			System.out.println(name+" Withdraw "+amount+" .Updated balance= "+balance);
		}else {
			System.out.println("Insuffcient Balance Withdraw Failed!.");
		}
	}
	
	
}
class BankAccountInfoDriver{
	public static void main(String[]args){
		BankAccountInfo B1 = new BankAccountInfo("Shubham",5000.0d);
		BankAccountInfo B2 = new BankAccountInfo("Dhiraj",7000.0d);
		
		System.out.print("Account1: ");
		B1.printAccountDetails();
		
		System.out.print("Account2: ");
		B2.printAccountDetails();
		
		B1.addDeposit(2000);
		B2.addDeposit(2000);
		
		B1.withdraw(1000);
		B2.withdraw(2500);
		
	    System.out.print("Account1: ");
		B1.printAccountDetails();
		
		System.out.print("Account2: ");
		B2.printAccountDetails();
		
	}
}