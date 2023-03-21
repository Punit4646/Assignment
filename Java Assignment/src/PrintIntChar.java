public class PrintIntChar {
    public void print(int n, char c) {
        System.out.println("Integer: " + n + ", Character: " + c);
    }

    public void print(char c, int n) {
        System.out.println("Character: " + c + ", Integer: " + n);
    }

    public static void main(String[] args) {
        PrintIntChar printer = new PrintIntChar();
        printer.print(10, 'A');
        printer.print('B', 20);
    }
}
