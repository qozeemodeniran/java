package non_access_modifiers;

// create a default class
class Abstract2 {
	
	// java main method
	public static void main(String[] args) {
		
		// create object of the Info call which inherits from attributes and methods from Abstract1 class
		Info obj = new Info();
		
		// access the attributes of the abstract supper class via obj
		System.out.println("Name: " + obj.name);
		System.out.println("Age: " + obj.age);
		
		// access attributes of the subclass via obj
		System.out.println("Major: " + obj.major);
		
		// call the abstract method of the abstract class via obj
		obj.info();
	}
}
