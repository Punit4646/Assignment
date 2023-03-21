import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    int number;
    
    System.out.println("Enter 5 numbers: ");
    for (int i = 0; i < 5; i++) {
      number = input.nextInt();
      sum += number;
    }
    
    double average = sum / 5.0;
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }
}
