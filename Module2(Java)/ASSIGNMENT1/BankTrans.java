import java.util.Scanner;
class BankTrans{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Amount:");
		int Amount = sc.nextInt();
		
		if(Amount>0){
			System.out.println("Deposite Transaction.");
		}else{
			System.out.println("Withdrawal Transaction.");
		}
	}
}