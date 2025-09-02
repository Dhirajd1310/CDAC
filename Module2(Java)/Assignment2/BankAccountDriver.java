class BankAccount{
	private String name;
	private double balance;
	private static double interestRate;
	
	static{
		interestRate = 4.0;
		System.out.println("Bank Interest Rate Initialized: "+interestRate+" %_");
	}
	BankAccount(String name,double balance){
		this.name=name;
		this.balance=balance;
	}
	
	public String getName(){
		return name;
	}
	public double getBalance(){
		return balance;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public void printAccountDetails(){
		 System.out.println("Name="+name+", Balance="+balance+", Interest Rate="+interestRate+" %");
	}
}
class BankAccountDriver{
	public static void main(String[]args){
		BankAccount B1 = new BankAccount("Rohit",5000.0d);
		BankAccount B2 = new BankAccount("Priya",15000.0d);
		
		System.out.print("Account1: ");
		B1.printAccountDetails();
		
		System.out.print("Account2: ");
		B2.printAccountDetails();
		
		
	}
}