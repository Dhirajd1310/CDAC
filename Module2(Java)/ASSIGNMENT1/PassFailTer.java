import java.util.Scanner;
class PassFailTer{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		
		String op = (marks>=35)?"Pass":"Fail";
		
		System.out.println(op);
	}
}