package modifiers;

// default class
class DefaultAttr {
	
	// default attributes
	String txt = "Hello";
	int number = 20;
	
	// java main method
	public static void main(String... args) {
		
		// create object of the default (only accessible within same package) class 
		DefaultAttr obj = new DefaultAttr();
		
		// access attribute via obj
		System.out.println("Word: " + obj.txt);
		System.out.println("Number: " + obj.number);
	}

}
