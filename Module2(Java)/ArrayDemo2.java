import java.util.Scanner;
class ArrayDemo2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	whats 	
		int[] marks = new int[5];
		
		System.out.println("Enter 5 Students marks:");
		for(int i=0;i<marks.length;i++){
			System.out.println("Enter marks for students "+(i+1)+" : ");
			marks[i] = sc.nextInt();
		}
		
		int total =0;
		for(int i=0;i<marks.length;i++){
			total+=marks[i];
		}
		
		double average = (double)total/marks.length;
		
		System.out.println("\n--- Results ---");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
		
		System.out.println("Marks of each student:");
		for(int i =0;i<marks.length;i++){
			System.out.println("Student "+(i+1)+" : "+marks[i]);
		}
	}
}