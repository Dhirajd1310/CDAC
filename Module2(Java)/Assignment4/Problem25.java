//Problem 25: Payment Processing 

import java.util.Scanner;
class Problem25{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount:");
		String str1 =sc.nextLine();
		int a = Integer.parseInt(str1);
		
		System.out.println("Enter the amount to add:");
		String str2 =sc.nextLine();
		int b = Integer.parseInt(str2);
		
		int result = a + b ;
		
		System.out.println(a + " + " +b+" = " +result);
		
	}
}