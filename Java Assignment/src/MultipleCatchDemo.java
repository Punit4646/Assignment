public class MultipleCatchDemo {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 30 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}
