public class TestThreadTwice1 extends Thread {
    public void run() {
        System.out.println("Thread started.");
    }

    public static void main(String[] args) {
        TestThreadTwice1 t1 = new TestThreadTwice1();
        t1.start();
        t1.start(); // This will result in an IllegalThreadStateException
    }
}
