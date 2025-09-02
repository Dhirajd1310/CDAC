import java.util.Scanner;
class SumOfNInterges{
	
	public static int calculateSum(int N){
		int sum=0;
		for(int i=0;i<=N;i++){
			sum += i;
		}
		return sum;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the Number:");
		int num = sc.nextInt();
		
	   int result =calculateSum(num);
	   
	   System.out.println("The sum of numbers from 1 to "+ num +" is "+result);	   
		
		
	}

}