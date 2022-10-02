package oop;

public class MultipleMethods {
	// method 1 with no parameter
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}
	
	// method 2 with parameter
	public void speed(int maxspeed) {
		System.out.println("Max sped is: " + maxspeed);
	}

	public static void main(String[] args) {
		// create an object of the class
		MultipleMethods obj = new MultipleMethods();
		
		// call the methods of the class via its object
		obj.fullThrottle();
		obj.speed(504);
	}

}
