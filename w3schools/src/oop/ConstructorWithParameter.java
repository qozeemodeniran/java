package oop;

public class ConstructorWithParameter {
	
	int number;
	
	// constructor
	public ConstructorWithParameter(int value) {
		number = value + 2;
	}

	public static void main(String[] args) {
		ConstructorWithParameter obj = new ConstructorWithParameter(99);
		System.out.println(obj.number);
	}

}
