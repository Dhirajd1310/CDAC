import java.util.Scanner;
class OldYoung{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age of Friend 1:");
		int Frd1 = sc.nextInt();
		
		System.out.println("Enter age of Friend 1:");
		int Frd2 = sc.nextInt();
		
		System.out.println("Enter age of Friend 1:");
		int Frd3 = sc.nextInt();
		
		if(Frd1>Frd2 && Frd1>Frd3){
			System.out.println("Oldest:"+Frd1);
		}if(Frd2>Frd1 && Frd2>Frd3){
			System.out.println("Oldest:"+Frd2);
		}else{
			System.out.println("Oldest:"+Frd3);
		}
		
		if(Frd1<Frd2 && Frd1<Frd3){
			System.out.println("Youngest:"+Frd1);
		}if(Frd2<Frd1 && Frd2<Frd3){
			System.out.println("Youngest:"+Frd2);
		}else{
			System.out.println("Youngest:"+Frd3);
		}
	}
}
