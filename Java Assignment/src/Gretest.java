import java.util.Scanner;

public class Gretest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = scan.nextInt();

    System.out.print("Enter second number: ");
    int num2 = scan.nextInt();

    System.out.print("Enter third number: ");
    int num3 = scan.nextInt();

    int greatest = num1;
    if (num2 > greatest) {
      greatest = num2;
    }
    if (num3 > greatest) {
      greatest = num3;
    }

    System.out.println("Greatest number is: " + greatest);
  }
}
