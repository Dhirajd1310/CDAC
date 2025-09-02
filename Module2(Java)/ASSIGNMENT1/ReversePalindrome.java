import java.util.Scanner;

class ReversePalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter 4-digit number: ");
        int num = sc.nextInt();

        int reversed = 0;
        int temp = num;

        
        for (int i = 0; i < 4; i++) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

       
        System.out.println("Reversed number: " + reversed);

      
        if (reversed == num) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }
}
