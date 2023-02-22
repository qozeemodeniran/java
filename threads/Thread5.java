package thread;

// Concurrency Problem: values become unpredicatble when the main program and the htreads are reading and writing the same variable.

// in this code, the value of the variable 'amount' is unpredictable
public class Thread5 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Thread5 thread5 = new Thread5();
        thread5.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}