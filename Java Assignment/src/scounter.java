import java.util.Scanner;

public class scounter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = input.nextLine();

    int letters = 0, spaces = 0, digits = 0, others = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (Character.isLetter(ch)) {
        letters++;
      } else if (Character.isDigit(ch)) {
        digits++;
      } else if (Character.isSpaceChar(ch)) {
        spaces++;
      } else {
        others++;
      }
    }

    System.out.println("Letters: " + letters);
    System.out.println("Digits: " + digits);
    System.out.println("Spaces: " + spaces);
    System.out.println("Others: " + others);
  }
}
