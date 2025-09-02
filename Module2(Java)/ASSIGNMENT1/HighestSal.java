import java.util.Scanner;
class HighestSal{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Salary for company1:");
		int sal1 = sc.nextInt();
		
		System.out.println("Enter the Salary for company2:");
		int sal2 = sc.nextInt();
		
		System.out.println("Enter the Salary for company3:");
		int sal3 = sc.nextInt();
		
		if(sal1>sal2 && sal1 >sal3){
			System.out.println("Company 1 has the highest salary.");
		}else if (sal2>sal1 && sal2>sal3){
			System.out.println("Company 2 has the highest salary.");
		}else if (sal3>sal1 && sal3>sal2){
			System.out.println("Company 2 has the highest salary.");
		}else{
			System.out.println("Two or more companies offer the same highest salary");
		}
	}
}