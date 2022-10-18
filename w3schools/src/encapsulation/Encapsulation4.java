package encapsulation;

// public class
public class Encapsulation4 {
	
	// java main method
	public static void main(String[] args) {
		
		// create object of the class where attributes are declared
		Encapsulation3 obj = new Encapsulation3();
		
		// set private attribute value via the object
		obj.setSsn(123456);
		
		// get private attributes value via the object
		System.out.println("Your Social Security Number, SSN is: " + obj.getSsn());
	}
}
