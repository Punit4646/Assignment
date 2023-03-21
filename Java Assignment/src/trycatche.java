import java.util.Scanner;

public class trycatche {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1, num2, result;

    try {
      System.out.print("Enter first number: ");
      num1 = input.nextInt();

      try {
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        result = num1 / num2;

        System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
        System.out.println("Error: Division by zero!");
      }

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
