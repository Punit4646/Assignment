import java.util.Scanner;

public class pinteger {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input an integer number less than ten billion: ");
    int number = input.nextInt();

    int count = 0;
    while (number > 0) {
      number /= 10;
      count++;
    }

    System.out.println("Number of digits in the number: " + count);
  }
}
