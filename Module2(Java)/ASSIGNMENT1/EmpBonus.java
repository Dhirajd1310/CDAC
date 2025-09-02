import java.util.Scanner;
class EmpBonus{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary:");
		double Sal = sc.nextDouble();
		
		System.out.println("Enter years of Services:");
		int yearOfser = sc.nextInt();
		
		double bonusamt=0;
		
		if(yearOfser > 5){
			bonusamt = Sal*0.05;
		} else {
			bonusamt= Sal;
		}
		System.out.println("Bouns Amount:"+ bonusamt);
	}
}
