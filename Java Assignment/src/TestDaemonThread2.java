public class TestDaemonThread2 extends Thread {
    public void run() {
        if (isDaemon()) {
            System.out.println("Daemon thread started.");
        } else {
            System.out.println("Non-daemon thread started.");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        if (isDaemon()) {
            System.out.println("Daemon thread finished.");
        } else {
            System.out.println("Non-daemon thread finished.");
        }
    }

    public static void main(String[] args) {
        TestDaemonThread2 t1 = new TestDaemonThread2();
        TestDaemonThread2 t2 = new TestDaemonThread2();

        t1.start();
        t1.setDaemon(true);
        t2.start();
    }
}
