import java.util.Scanner;

class GradeWithPlusMinus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        String grade;

        if (marks >= 90 && marks <= 100) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "A−";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
    }
}
