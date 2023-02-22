package thread;

// Solviing the concurrentcy problem:
/*
- avoid sharing attributes between threads as possible
- use the isAlive() method if attributes must be shared.

isAlive() - checks if the thread is done running before using any attributes that the thread can change.
*/

public class Thread6 extends Thread {
    public static int fee = 0;

    public static void main(String[] args) {
        Thread6 thread6 = new Thread6();
        thread6.start();

        // waits for thread to finish
        while(thread6.isAlive()) {
            System.out.println("Patiently waiting...");
        }

        // update variable fee and print latest value
        System.out.println("Thread6: " + fee);
        fee++;
        System.out.println("Thread6: " + fee); 
    }

    public void run() {
        fee++;
    }
}