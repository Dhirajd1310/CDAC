class BankName{
	private String name;
	private double balance;
	
	private static  String bankName="CDAC Bank";
	
	
	BankName(String name,double balance){
		this.name=name;
		this.balance=balance;
	}
	
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public static void displayBankName(){
		System.out.println("Welcome to CDAC Mumbai! ");
	}
	
	public void printAccountDetails(){
		 System.out.println("Name="+name+", Balance="+balance+"Bank Name:"+bankName);
	}
	
}
class BankNameInfo{
	public static void main(String[]args){
		BankNameInfo B1 = new BankNameInfo("Shubham",5000.0d);
		
		System.out.print("Account1: ");
		B1.BankNameInfo();
		
		
	}
}