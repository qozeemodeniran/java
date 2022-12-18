package oop;

public class StaticVsPublicMethods {
	// create static method (can be accesses without creating its object) 
	static void Static() {
		System.out.println("Static Method: I can be be accesed without create my object");
	}
	
	// create public method (can only be accessed with objects)
	public void Public() {
		System.out.println("Public Method: I can only be accessed by via the object of my class");
	}

	public static void main(String[] args) {
		// call static without object
		Static();
		
		// call public method with the object of its class
		StaticVsPublicMethods obj = new StaticVsPublicMethods();
		obj.Public();

	}

}
