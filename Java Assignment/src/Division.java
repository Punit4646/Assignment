import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("The result of division is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You cannot divide by zero. Please enter a non-zero number for the second value.");
        }

        scanner.close();
    }
}
