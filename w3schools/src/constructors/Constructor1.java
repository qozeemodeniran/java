package constructors;

// create the constructor class
public class Constructor1 {
	
	// create class attribute
	int number;
	
	// create a class constructor for the main class
	public Constructor1() {
		
		// set the initial value for the constructor class attribute
		number = 100;
	}
	
	// create the java main class
	public static void main(String[] args) {
		
		// create an object of class Constructor1 which will call the constructor
		Constructor1 obj = new Constructor1();
		
		// print the value of number, which was set by the constructor
		System.out.println(obj.number);
	}
}
