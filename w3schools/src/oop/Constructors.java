package oop;

public class Constructors {
	
	int number;
	
	// constructor
	public Constructors() {
		number = 101;
	}

	public static void main(String[] args) {
		Constructors obj = new Constructors();
		System.out.println(obj.number);
	}

}
