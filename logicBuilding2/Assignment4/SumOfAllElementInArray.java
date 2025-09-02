import java.util.Scanner;

class SumOfAllElementInArray
{
    public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter the Array Size:");
		 int size = sc.nextInt();
		 int sum=0;
		
		int[] arr = new int[size];
		
		System.out.println("Enter the array Elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The Array Elements are:");
		for( int elements :arr ){
			sum+=elements;
		}
		System.out.print("The Sum of all elements is:"+sum);
	}
}