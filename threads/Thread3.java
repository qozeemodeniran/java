package thread;

public class Thread3 extends Thread {
    public static void main(String[] args) {
        // since the class extends the Thread class, we can run a thread by creating an instance of the class and call its start() method.
        Thread3 thread3 = new Thread3();
        thread3.start();

        System.out.println("Code outside the thread"); 
    }
    public void run() {
        System.out.println("Code running in a thread");
    }
}