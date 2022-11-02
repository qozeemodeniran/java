package packages_and_api;

// import package class
import java.util.Scanner;

public class ClassImport2 {
	
	// java main method
	public static void main(String[] args) {
		
		// create object of the Scanner
		Scanner scanner = new Scanner(System.in);
		
		// request user input
		System.out.print("Enter your message here: ");
		
		// save user input in a variable
		String introduction = scanner.nextLine();
		
		// close object
		scanner.close();
		
		// output the user's input
		System.out.println(introduction);
	}

}
