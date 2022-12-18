package modifiers;

// create a public class
public class PrivateAttr {
	
	// create private attributes - attributes are only accessible within declared class
	private String ssn = "101231";
	private String routing_number = "1972101231";
	private int net_worth = 100000000;
	
	// create java mian class
	public static void main(String[] args) {
		

		// create object of the class
		PrivateAttr obj = new PrivateAttr();
		
		// access the private within declared class
		System.out.println("Hello User, your ssn, routing number and net worth are " + obj.ssn + 
				", " + obj.routing_number + ", " + obj.net_worth + " respectively");
	}
}
