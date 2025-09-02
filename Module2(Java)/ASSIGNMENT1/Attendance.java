import java.util.Scanner;
class Attendance{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total class held:");
		int lectures = sc.nextInt();
		
		System.out.println("Enter classes attended:");
		int lectAttened = sc.nextInt();
		
	    double attend = (lectAttened*100)/lectures;		
		
		if(attend>=75){
			System.out.println("Student is allowed to sit for exam.");
		}else{
			System.out.println("Student is not allowed to sit for exam.");
		}
	}
}
