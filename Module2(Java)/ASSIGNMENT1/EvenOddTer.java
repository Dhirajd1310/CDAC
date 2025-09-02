import java.util.Scanner;
class EvenOddTer{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		String op = (num%2==0)?"Even":"odd";
		
		System.out.println("Number is "+op);
	}
}
