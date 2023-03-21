public class PrintNumber {
    public void printn(int n) {
        System.out.println("Integer number: " + n);
    }

    public void printn(float n) {
        System.out.println("Float number: " + n);
    }

    public void printn(double n) {
        System.out.println("Double number: " + n);
    }

    public void printn(long n) {
        System.out.println("Long number: " + n);
    }

    public void printn(short n) {
        System.out.println("Short number: " + n);
    }

    public void printn(byte n) {
        System.out.println("Byte number: " + n);
    }

    public static void main(String[] args) {
        PrintNumber printer = new PrintNumber();
        printer.printn(10);
        printer.printn(3.14f);
        printer.printn(3.141592653589793);
        printer.printn(10000000000L);
        printer.printn((short) 32767);
        printer.printn((byte) 127);
    }
}
