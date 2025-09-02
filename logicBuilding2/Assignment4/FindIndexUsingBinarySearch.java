import java.util.Arrays;
import java.util.Scanner;

class FindIndexUsingBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; 

        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

      
        Arrays.sort(arr);

        
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

      
        int index = Arrays.binarySearch(arr, key);

        
        if (index >= 0) {
            System.out.println("The number " + key + " is found at index " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}
