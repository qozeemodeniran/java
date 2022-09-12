package methods;

public class CallingMethods {
	// create a method
	static void Myname() {
		// what will this method do? it will print my name
		System.out.println("My name is Qozeem Odeniran.");
	}
	
	// create another method
	static void Mymajor() {
		System.out.println("I am majoring in \'Information Technology\'.");
	}
	
	// call the method you created in the main class where java program runs
	public static void main(String[] args) {
		Myname();
		Mymajor();
	}
}
