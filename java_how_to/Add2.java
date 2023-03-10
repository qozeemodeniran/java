package java_how_to;

import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        // adding two numbers from user input
        int num1, num2, sum;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = scan.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = scan.nextInt();

        scan.close();

        sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum );
    }
}