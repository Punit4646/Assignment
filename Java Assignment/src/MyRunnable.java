public class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Hello from MyRunnable thread!");
    }

    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        // Create a new thread and pass the instance of MyRunnable to the constructor
        Thread myThread = new Thread(myRunnable);

        // Start the thread
        myThread.start();
    }
}
