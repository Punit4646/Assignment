public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            // Base case: 0! = 1
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
