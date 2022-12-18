package oop;

public class MultipleObjects {
	
	// class properties/attributes
	String firstname = "Qozeem";
	String lastname = "Odeniran";
	String fullname = firstname + " " + lastname;

	public static void main(String[] args) {
		
		// object 1
		MultipleObjects obj1 = new MultipleObjects();
		
		// object 2
		MultipleObjects obj2 = new MultipleObjects();
		
		// object 3
		MultipleObjects obj3 = new MultipleObjects();
		
		// accessing class properties via the object(s)
		System.out.println("First Name: " + obj1.firstname);
		System.out.println("Last Name: " + obj2.lastname);
		System.out.println("Hello, " + obj3.fullname);
		

	}

}
