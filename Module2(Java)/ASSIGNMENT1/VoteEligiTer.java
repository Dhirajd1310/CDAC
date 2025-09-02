import java.util.Scanner;
class VoteEligiTer{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age:");
		int age = sc.nextInt();
		
		String op = (age>=18)?"Eligible to vote":"Not Eligible to vote";
		
		System.out.println(op);
	}
}
