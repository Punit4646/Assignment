public class Division1 {
  public static void main(String[] args) {
    try {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      
      int result = num1 / num2;
      
      System.out.println("The result of division is: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Exception caught: " + e);
      System.out.println("Cannot divide by zero.");
    } catch (Exception e) {
      System.out.println("Exception caught: " + e);
      System.out.println("Please enter two integers.");
    }
  }
}
