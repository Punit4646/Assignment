public class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Hello from MyThread!");
    }

    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread myThread = new MyThread();

        // Start the thread
        myThread.start();
    }
}
