import java.util.Scanner;

public class TryCatchExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    try {
      int num = scanner.nextInt();
      int result = 10 / num;
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: Cannot divide by zero.");
    } catch (Exception e) {
      System.out.println("Error: Invalid input.");
    } finally {
      scanner.close();
      System.out.println("Program ended.");
    }
  }
}
