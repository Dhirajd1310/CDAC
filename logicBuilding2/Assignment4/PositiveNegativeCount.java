import java.util.Scanner;

class  PositiveNegativeCount
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
		
		int positivecount=0;
		int negativecount=0;
		
		for(int num:arr){
			if(num>0){
				positivecount++;
			}else if(num<0){
				negativecount++;
			}
		}
		System.out.println("The Positive Count is:"+positivecount);
		System.out.println("The Negative Count is:"+negativecount);
	}
}
