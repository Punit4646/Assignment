import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            validate(age);
            System.out.println("Welcome to vote.");
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void validate(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("not valid");
        }
    }
}
