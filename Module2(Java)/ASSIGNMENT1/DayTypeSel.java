import java.util.Scanner;
class DayTypeSel{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day type(1-Workday,2-Weekend:");
		int type = sc.nextInt();
		
		if(type == 1){
			System.out.println("You have a lots of work today.");
		}else if(type==2) {
			System.out.println("its a weekend no work today..");
		}else {
			System.out.println("Wrong input.");
		}
	}
}

