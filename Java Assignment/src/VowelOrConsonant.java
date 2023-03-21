import java.util.Scanner;

public class VowelOrConsonant {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a single character: ");
    String userInput = input.nextLine();
    
    if (userInput.length() > 1) {
      System.out.println("Error: input is not a single character");
    } else if (!Character.isLetter(userInput.charAt(0))) {
      System.out.println("Error: input is not a letter");
    } else if (userInput.equalsIgnoreCase("a") || userInput.equalsIgnoreCase("e") || 
               userInput.equalsIgnoreCase("i") || userInput.equalsIgnoreCase("o") || 
               userInput.equalsIgnoreCase("u")) {
      System.out.println("Vowel");
    } else {
      System.out.println("Consonant");
    }
  }
}
