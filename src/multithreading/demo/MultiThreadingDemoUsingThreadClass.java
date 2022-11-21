package multithreading.demo;

public class MultiThreadingDemoUsingThreadClass extends Thread {

    String payload;

    public MultiThreadingDemoUsingThreadClass(String payload) {
        this.payload = payload;
    }

    public void run() {
        System.out.println("Starting Thread - " + Thread.currentThread().getName());
        System.out.println("Processing Task - " + Thread.currentThread().getName() + "  " + payload + " length is " + payload.length());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exiting Thread - " + Thread.currentThread().getName());
    }
}
