package methodOverloading;

public class Method1 {
	
	static int IntPlusMethod(int a, int b) {
		return a + b;
	}
	
	static double DoublePlusMethod(double c, double d) {
		return c + d;
	}
	
	// overloading a method to do same thing as above
	static int PlusMethod(int u, int v) {
		return u + v;
	}
	static double PlusMethod(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IntPlusResult = IntPlusMethod(40, 4);
		System.out.println("int: " + IntPlusResult);
		
		double DoublePlusResult = DoublePlusMethod(39.9999, 3.9999);
		System.out.println("double: " + DoublePlusResult);
		
		
		int PlusMethodInt = PlusMethod(99, 1);
		System.out.println("Overloaded Int: " + PlusMethodInt);
		
		double PlusMethodDouble = PlusMethod(98.99999, 0.99999);
		System.out.println("Overloaded Double: " + PlusMethodDouble);
	}

}
