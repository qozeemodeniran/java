package modifiers;

// default class
class ProtectedAttr {
	
	// protected attributes
	protected String name = "Qozeem";
	protected String username = "qodeniran";
	protected String password = "mypassword1234";
}

// create default subclass with the "extends keyword
class ProtectedAttrSub extends ProtectedAttr {
	
	// private attribute
	private int token = 231101;
	
	// java main class
	public static void main(String[] args) {
		
		// object of the subclass
		ProtectedAttrSub obj = new ProtectedAttrSub();
		
		// access protected attributes from superclass and private attributes from subclass
		System.out.println("Hello " + obj.name + ", you username, password and token are: "
				+ obj.username + ", " + obj.password + ", " + obj.token + " respectively.");
	}
}

