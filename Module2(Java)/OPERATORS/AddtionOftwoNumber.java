import java.util.Scanner;
class AddtionOftwoNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second Number:");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2 ;
		
		System.out.println("The Addtion of Two Numbers are :"+ sum);
		
	}
}