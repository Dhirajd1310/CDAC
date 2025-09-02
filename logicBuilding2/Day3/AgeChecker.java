import java.util.Scanner;

class AgeChecker
{
	public static void checkAgeCategory(int num){
		if(num<18)
		{
			System.out.println("You are a Kid.");
		}else if(num>=18 && num<=35){
			System.out.println("You are a Adult.");
		}else{
			System.out.println("You are a senior Citzen.");
		}	
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();
		
		checkAgeCategory(age);
	}
}