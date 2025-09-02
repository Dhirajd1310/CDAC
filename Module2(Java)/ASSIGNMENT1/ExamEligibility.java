import java.util.Scanner;
class ExamEligibility{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total class held:");
		int lectures = sc.nextInt();
		
		System.out.println("Enter classes attended:");
		int lectAttened = sc.nextInt();
		
		System.out.println("Enter the medical cause (Y/N):");
		char medicalcause = sc.next().charAt(0);
		
	    double attend = (lectAttened*100)/lectures;		
		
		if(attend>=75 || medicalcause=='Y' || medicalcause=='y'){
			System.out.println("Student is allowed to sit for exam.");
		}else{
			System.out.println("Student is not allowed to sit for exam.");
		}
	}
}