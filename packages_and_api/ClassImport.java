package packages_and_api;

// import package 
import java.util.Scanner;

public class ClassImport {
	
	// java main method
	public static void main(String[] args) {
		
		// create an object of the Scanner class
		Scanner obj = new Scanner(System.in);
		
		// output a prompt requesting user input
		System.out.print("Enter your full name: ");
		
		// Read user input with the nextLine() method
		String fullname = obj.nextLine();
		
		obj.close();
		
		// output user's input
		System.out.println("Hello everyone, the new professor's name is " + fullname);
	}

}
