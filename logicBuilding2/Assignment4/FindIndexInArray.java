import java.util.Scanner;

class FindIndexInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];  

       
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        
        if (index >= 0) {
            System.out.println("The number " + key + " is found at index " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}
