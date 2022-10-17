package non_access_modifiers;

// create an abstract class
abstract class Abstract1 {
	
	// define attributes
	public String name = "Qozeem";
	public int age = 28;
	
	// create an abstract method (does not have a body)
	public abstract void info();
}

// create a subclass for Abstract1 class
class Info extends Abstract1 {
	
	// define class attributes
	public String major = "IT";
	
	// provide the body of the abstract method info()
	public void info() {
		System.out.println("This is all about me.");
	}
}
