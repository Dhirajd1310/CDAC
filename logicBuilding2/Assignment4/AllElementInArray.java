import java.util.Scanner;

class AllElementInArray
{
    public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter the Array Size:");
		 int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the array Elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The Array Elements are:");
		for( int elements :arr ){
			System.out.print(elements+" ");
		}
	}
}

		