//Problem 4: Employee Data 

import java.util.Scanner;
class Problem4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int emp = sc.nextInt();
		
		
		double sal[]= new double[emp];
		
		System.out.println("Enter the Salries of employee:");
		for(int i=0;i<sal.length;i++){
			sal[i]=sc.nextDouble();
		}
		System.out.println("Enter employee number who wage you to calculate :");
		int index=sc.nextInt();
		
		System.out.println("Enter hours work by employee:");
		int hours=sc.nextInt();
		
		try{
			double selectSal = sal[index];
			try{
				if(hours == 0){
					throw new ArithmeticException("Division by zero");
				}else{
					double wage = selectSal / hours ;
					System.out.println("Working hours: "+wage);
				}
			}catch(ArithmeticException e){
				System.out.println(e.getMessage());
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Index");
		}

	}
}