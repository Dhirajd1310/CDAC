import java.util.Scanner;
class ExamPF{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks(0-100):");
		int marks = sc.nextInt();
		
		if(marks>=35){
			System.out.println("Student has passed in exam.");
		}else{
			System.out.println("Student has Failed in exam.");
		}
	}
}