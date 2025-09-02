import java.util.Scanner;

class  AvgofAllElementInArray
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
		
		for(int i=0;i< arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("Avg of all element in array is:"+sum/size);
	}
}
