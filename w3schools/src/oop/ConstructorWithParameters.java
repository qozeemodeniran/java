package oop;

public class ConstructorWithParameters {
	String name, major;
	
	// constructor
	public ConstructorWithParameters(String name1, String major1) {
		name = name1;
		major = major1;
	}

	public static void main(String[] args) {
		ConstructorWithParameters obj = new ConstructorWithParameters("Qozeem Odeniran", "Information Technology");
		System.out.println("Hello " + obj.name + " of " + obj.major);
	}

}
