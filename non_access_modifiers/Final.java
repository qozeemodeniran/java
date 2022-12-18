package non_access_modifiers;

public class Final {
	
	// declare attributes with "final" to avoid overriding the values
	final double price = 20.19;
	final int item_no = 10;
	
	// java main method
	public static void main(String[] args) {
		
		// object creation
		Final obj = new Final();
		
		// trying to change the final attribute value will throw an error
		obj.price = 20.20;
		obj.item_no = 11;
	}

}
