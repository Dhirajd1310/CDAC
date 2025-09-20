class BankAccountType{
	int accountNo;
	double balance;
	
	BankAccountType(int accountNo,double balance){
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	public void displayBankAccountType(){
		System.out.println("Account No :"+accountNo+" Balance :"+balance);
	}
}
class SavingAccount extends BankAccountType{
	int interestRate;
	SavingAccount(int accountNo,double balance,int interestRate){
			super(accountNo,balance);
			this.interestRate=interestRate;
	}
	
	public void displaySavingAccount(){
		System.out.println("Saving->"+accountNo+", Balance ="+balance+", Intrest="+interestRate+"%");
	}	
}
class CurrentAccount extends BankAccountType{
	double overdraftLimit;
	CurrentAccount(int accountNo,double balance,double overdraftLimit){
		super(accountNo,balance);
		this.overdraftLimit=overdraftLimit;
	}

	public void displaySCureentAccount(){
		System.out.println("Current->"+accountNo+", Balance ="+balance+", Overdraft="+overdraftLimit);
	}
}
class BankAccountTypeDriver{
	public static void main(String[]args){
		SavingAccount b1 = new SavingAccount(101,7000,5);
		b1.displaySavingAccount();
		
		CurrentAccount b2 = new CurrentAccount(102,10000,2000);
		b2.displaySCureentAccount();
	}
}