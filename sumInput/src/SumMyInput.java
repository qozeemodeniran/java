import java.util.Scanner;

public class SumMyInput{
	public static void main(String[] args) {
		
//		create scanner object
		Scanner input = new Scanner(System.in);
		
//		Get user input 1
		System.out.print("Enter value 1: ");
		Double value1 = input.nextDouble();
		
//		Get user input 2
		System.out.print("Enter value 2: ");
		Double value2 = input.nextDouble();
		
//		Output sum of two user's input
		System.out.printf("Sum of " + value1 + " and " + value2 + " is %s%n", value1 + value2);
	}
}