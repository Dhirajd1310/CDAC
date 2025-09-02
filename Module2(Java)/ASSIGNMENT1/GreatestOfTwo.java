import java.util.Scanner;
class GreatestOfTwo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First Test Score:");
		int test1 = sc.nextInt();
		
		System.out.println("Enter The Second Test Score:");
		int test2 = sc.nextInt();
		
		if(test1>test2){
			System.out.println(test1+" has the Higher score");
		}else{
			System.out.println(test2+" has the Higher score");
		}
	}
}