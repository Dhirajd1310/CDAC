import java.util.Scanner;
class AllNameInStringArray{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of Array:");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] str = new String[size];
		
		System.out.println("Enter the array Elements:");
		for(int i=0;i<str.length;i++){
			str[i]=sc.nextLine();
		}
		
		System.out.println("The String names are:");
		 for(String names :str){
			 System.out.println(names);
		 }
		
	}
}