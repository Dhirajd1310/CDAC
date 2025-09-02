import java.util.Scanner;
class DaysOfMonth{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Month(0-12):");
		int num = sc.nextInt();
		
		if(num==1){
			System.out.println("Jan:31 Days.");
		}else if(num==2){
			System.out.println("Feb:28 or 29 Days.");
		}else if(num==3){
			System.out.println("Mar:31 Days.");
		}else if(num==4){
			System.out.println("April:30 Days.");
		}else if(num==5){
			System.out.println("May:31 Days.");
		}else if(num==6){
			System.out.println("June:30 Days.");
		}else if(num==7){
			System.out.println("July:31 Days.");
		}else if(num==8){
			System.out.println("Aug:31 Days.");
		}else if(num==9){
			System.out.println("Sept:30 Days.");
		}else if(num==10){
			System.out.println("Oct:31 Days.");
		}else if(num==11){
			System.out.println("Nov:30 Days.");
		}else if(num==12){
			System.out.println("Dec:31 Days.");
		}else {
			System.out.println("Wrong input.");
		}
	}
}