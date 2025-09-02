import java.util.Scanner;
class MeassBasedNum{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a  number(0-5):");
		int num = sc.nextInt();
		
		if(num==1){
			System.out.println("You Selected option 1.");
		}else if(num==2){
			System.out.println("You Selected option 2.");
		}else if(num==3){
			System.out.println("You Selected option 3.");
		}else if(num==4){
			System.out.println("You Selected option 4.");
		}else if(num==5){
			System.out.println("You Selected option 5.");
		}else {
			System.out.println("You Selected a wrong option.");
		}
	}
}
