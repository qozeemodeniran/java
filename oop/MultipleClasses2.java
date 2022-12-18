package oop;

// class with the main method
public class MultipleClasses2 {

	public static void main(String[] args) {
		
		// object(s) creation
		MultipleClasses1 obj = new MultipleClasses1();
		MultipleClasses1 obj2 = new MultipleClasses1();
		
		//modifying the networth attribute
		obj2.networth = 100;
		
		// access class attribute via created object
		System.out.println(obj.introduction);
		System.out.println("New networth: " + obj2.networth + " million dollars!");

	}

}
