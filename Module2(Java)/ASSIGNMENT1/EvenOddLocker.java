import java.util.Scanner;
class EvenOddLocker{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the locker Number:");
		int lockerNum = sc.nextInt();
		
		if(lockerNum%2==0){
			System.out.println("Even Lock Number.");
		}else{
			System.out.println("Odd Lock Number.");
		}
	}
}