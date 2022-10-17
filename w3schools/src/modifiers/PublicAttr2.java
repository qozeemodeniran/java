package modifiers;

// create default class
public class PublicAttr2 {
	
	// create java main method
	public static void main(String[] args) {
		
		// create an object of the public class previously created
		PublicAttr1 obj = new PublicAttr1();

		// access the attribute of the public class via its object
		System.out.println("Dear All, my name is " + obj.name + ". I am " + obj.age + " years old,"
				+ " and you can reach me via my email address at " + obj.email + ".");
	}
}
