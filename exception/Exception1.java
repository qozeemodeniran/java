package exception;

import java.util.Scanner;

class Exception1 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a value: ");
            int value1 = scan.nextInt();
            System.out.println("You entered: " + value1);
        } catch(Exception e) {
            System.out.println("Value is probably not an integer.");
        }

        // the code in the "finally" block runs irrespective of the bug present in the code
        finally {
            System.out.println("The try...catch block executed successfully");
        }
    }
}