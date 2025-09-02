import java.util.Scanner;

class  LargestElementInArray
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
		
		int largest=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest){
				largest=arr[i];
			}
		}
		System.out.println("The largest element in the array is:"+largest);
	}
}

		
		