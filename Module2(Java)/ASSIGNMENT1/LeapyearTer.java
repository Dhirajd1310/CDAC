import java.util.Scanner;
class LeapyearTer{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The year:");
		int year = sc.nextInt();
		
		String result = (year % 4 == 0)?((year % 100 == 0)? ((year % 400 == 0) ? "a Leap Year" : "Not a Leap Year") : "a Leap Year") : "Not a Leap Year";
		
		System.out.println(year +"is"+result);
		}
	}