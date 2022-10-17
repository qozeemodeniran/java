package non_access_modifiers;

public class Static {
	
	// create static method which can be accessed without creating an object
	static void StaticMethod() {
		System.out.println("I can be called without an object");
	}
	
	// create public method that must be called via objects
	public void PublicMethod() {
		System.out.println("I can only be called via objects");
	}
	
	// java main method
	public static void main(String[] args) {
		
		// calling static method with object
		StaticMethod();
		
		// create an object of the class in order to call the pulbic method
		Static obj = new Static();
		
		// call the public method via obj
		obj.PublicMethod();
	}

}
