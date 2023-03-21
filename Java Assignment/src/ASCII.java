import java.util.Scanner;

public class ASCII { //American Standard Code for Information Interchange
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char character = input.next().charAt(0);

    int ascii = (int) character;
    System.out.println("The ASCII value of " + character + " is: " + ascii);
  }
}
