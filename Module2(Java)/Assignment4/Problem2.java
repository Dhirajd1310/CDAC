//Problem 2: Exam Scores 
import java.util.Scanner;

class Problem2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array Size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array element:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the array index");
		int index = sc.nextInt();
		try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
	}
}