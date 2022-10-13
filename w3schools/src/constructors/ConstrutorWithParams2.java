package constructors;

public class ConstrutorWithParams2 {
	
	// initialize class attribute
	int num;
	
	// constructor creation
	public ConstrutorWithParams2(int mynum) {
		
		// set the class attribute to the constructor parameter
		num = mynum;
	}

	public static void main(String[] args) {
		
		// create the class object and supply the parameter value of the constructor
		ConstrutorWithParams2 obj = new ConstrutorWithParams2(20);
		
		// print the class attribute's value via the object
		System.out.println(obj.num);
	}

}
