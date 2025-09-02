import java.util.Arrays;
import java.util.Scanner;

class SearchNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Integer[] arr = new Integer[5];  

       
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

       
        if (Arrays.asList(arr).contains(key)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
