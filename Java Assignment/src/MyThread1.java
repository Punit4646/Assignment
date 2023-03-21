public class MyThread1 implements Runnable {
    private String name;

    public MyThread1(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Thread " + name + " started.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " interrupted.");
        }
        System.out.println("Thread " + name + " finished.");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread1("Thread 1"));
        Thread t2 = new Thread(new MyThread1("Thread 2"));

        t1.start();
        t2.start();
    }
}
