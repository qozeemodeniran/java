package constructors;

public class ConstrutorWithParams1 {
	
	// declare class attribute
	String name;
	
	// create a constructor with parameter
	public ConstrutorWithParams1(String fullname) {
		
		// set the class attribute value to the constructor parameter
		name = fullname;
	}
	
	// java main class
	public static void main(String[] args) {
		
		// create an object of the class and set set the parameter value of the constructor
		ConstrutorWithParams1 obj = new ConstrutorWithParams1("Qozeem Odeniranm");
		
		// print the class attribute's value via the object of the class
		System.out.println(obj.name);
	}

}
