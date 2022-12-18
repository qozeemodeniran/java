package constructors;

public class Constructor2 {
	
	// class attribute declaration
	String name;
	
	// create constructor
	public Constructor2() {
		
		// set the value for the clss attribute
		name = "Qozeem Odeniran";
	}
	
	// create java main class
	public static void main(String... args) {
		
		// create object of the class Constructor2 which will call the constructor
		Constructor2 obj = new Constructor2();
		
		// print the value of the class attribute using the object of the class
		System.out.println(obj.name);
	}

}
