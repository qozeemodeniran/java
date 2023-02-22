package thread;

// create thread by extending the Thread clas and overriding its run() method
public class Thread1 extends Thread {
    public void run() {
        System.out.println("Code running in a thread");
    }
}