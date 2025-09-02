import java.util.Scanner;

class SumOfIntergers
{
	public static int sumOfTwoIntergers(int num1,int num2){
		return num1+num2;
	}
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number One:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Number Two:");
		int num2 = sc.nextInt();
		
		int Sum = sumOfTwoIntergers(num1,num2);
		System.out.println("The Sum Of "+num1+" and "+num2+"is :"+ Sum);
		
	}
}