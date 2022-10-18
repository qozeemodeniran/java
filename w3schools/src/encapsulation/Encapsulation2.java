package encapsulation;

// public class
public class Encapsulation2 {

	// java main method
	public static void main(String[] args) {
		
		// create an object of the Encapsulation1 class where the private attributes are defined.
		Encapsulation1 obj = new Encapsulation1();
		
		// use the setName() method to set the value of the private attribute via obj
		obj.SetName("Qozeem");
		
		// use the getName() method to get the value of the private attribute via obj
		System.out.println(obj.getName());
	}
}
