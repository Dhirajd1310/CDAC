//Problem3:Age Input

import java.util.Scanner;
class Problem3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age");
		String age = sc.next();
		
		try{
			int a = Integer.parseInt(age);
		}catch(NumberFormatException npe ){
			System.out.println("Invalid number format");
		}
		
	}
}