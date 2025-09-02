import java.util.Scanner;
class LeapYearCheck{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year:");
		int year = sc.nextInt();

        if((year%4==0&&year%100!=0)||year%400==0){
			System.out.println("It is a Leap Year!");
		}
		else{
			System.out.println("It is a not a leap year !");
		}
	}
}
