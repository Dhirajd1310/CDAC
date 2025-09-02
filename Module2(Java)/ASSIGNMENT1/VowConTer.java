import java.util.Scanner;
class VowConTer{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Char:");
		char ch = sc.next().toLowerCase().charAt(0);
		
		System.out.println((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch +" is the vowel"):(ch +" is the consonantes"));
	}
}