import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks (out of 100): ");
        int marks = input.nextInt();
        input.close();
        displayGrade(marks);
    }

    public static void displayGrade(int marks) {
        String grade;
        if (marks >= 91 && marks <= 100) {
            grade = "AA";
        } else if (marks >= 81 && marks <= 90) {
            grade = "AB";
        } else if (marks >= 71 && marks <= 80) {
            grade = "BB";
        } else if (marks >= 61 && marks <= 70) {
            grade = "BC";
        } else if (marks >= 51 && marks <= 60) {
            grade = "CD";
        } else if (marks >= 41 && marks <= 50) {
            grade = "DD";
        } else {
            grade = "FAIL";
        }
        System.out.println("Grade: " + grade);
    }
}
