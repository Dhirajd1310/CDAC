//Report Title

import java.util.Scanner;

class Problem14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter The Original Title: ");
        String title = sc.nextLine();

        System.out.print("Enter  The Department Name: ");
        String dept = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(title);     
        sb.insert(title.indexOf("Report"), dept + " ");  
        sb.append("");      

        System.out.println("Title: " + sb.toString());
    }
}
