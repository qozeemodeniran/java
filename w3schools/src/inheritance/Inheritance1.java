package inheritance;

// parent class
class Inheritance1 {
	
	// class attribute
	protected String ssn = "123-45-678";
	
	// class method
	public void hobbies() {
		System.out.println("I like to study");
	}

}


// child class
class SubInheritance1 extends Inheritance1 {
	
	// class attribute
	private String major = "IT";
	
	// java main method
	public static void main(String[] args) {
		
		// object of child class
		SubInheritance1 obj = new SubInheritance1();
		
		// call method of parent class using object of child class
		obj.hobbies();
		
		// output the values of parent and child class's attributes
		System.out.println(obj.major + " " + obj.ssn);
	}
}
