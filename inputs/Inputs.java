package inputs;

// import Scanner class
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create object of Scanner 
        Scanner obj = new Scanner(System.in);

        // request input from user
        System.out.print("Enter your message: ");

        // read user input
        String message = obj.nextLine();

        // outpu user input using nextLine() which is used to red string
        System.out.println("You entered: " + message);
    }
}