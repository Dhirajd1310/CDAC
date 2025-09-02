import java.util.Scanner;

class StudyForLoop
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary :");
		int Salary = sc.nextInt();
		for(int i=1;i<=12;i++){
			System.out.println("Salary of :"+i+"th Month"+Salary+"Rs.");
			Salary+=20000;
		}
		System.out.println(" Your Saving after 12 months :"+Salary +"Rs.");
	}
}