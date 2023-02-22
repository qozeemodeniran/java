package thread;

public class Thread4 implements Runnable {
    public static void main(String[] args) {
        // since the class implements the Runnable interface, we can run a thread by passing the instance of the class to the Thread object's constructor, then call the start() method of the thread.
        Thread4 obj = new Thread4();
        Thread thread4 = new Thread(obj);
        thread4.start();
        System.out.println("Code outside the thread");
    }
    public void run() {
        System.out.println("Code running in a thread");
    }
}