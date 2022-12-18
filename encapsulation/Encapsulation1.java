package encapsulation;

// public class
public class Encapsulation1 {
	
	// declare private variable
	private String name;
	
	// Getter method to get the value of the private variable
	public String getName() {
		return name;
	}
	
	// Setter method to set the value of the private variable
	public void SetName(String newName) {
		this.name = newName; // 'this' keyword is used to refer to the current 
		// object
	}
}

// main method in Encapsulation2.java file