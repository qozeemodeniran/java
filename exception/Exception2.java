package exception;
import java.util.Scanner;

class Exception2 {
    static void result(Double cgpa) {
        if(cgpa <=3.4) {
            throw new ArithmeticException("Sorry, you didn't graduate with a distinction");
        } else {
            System.out.println("Congratulations, you graduated with a distinction.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your final CGPA: ");
        Double cgpa = scan.nextDouble();

        result(cgpa);
    }
}