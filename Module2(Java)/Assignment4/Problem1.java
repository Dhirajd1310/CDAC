//Problem 1: Salary Split
import java.util.Scanner;
class Problem1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Bonus Amount:");
		double bonus = sc.nextDouble();
		
		System.out.println("Enter the Employee:");
		int emp = sc.nextInt();
		
		if(emp==0){
			try{
				throw new ArithmeticException("Error:Division by zero allowed.");
			}catch(ArithmeticException e){
					System.out.println(e.getMessage());
			}
		}else {
			double empBonus = bonus / emp;
			System.out.println("Divded bonus of each employee is :"+empBonus);
		}	
	}
}