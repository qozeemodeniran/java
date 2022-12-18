package constructors;

public class ConstrutorWithManyParams {
	
	// class attributes declaration
	static String name;
	static String major;
	static int age;
	
	// constructor
	public ConstrutorWithManyParams(String student_name, String student_major, int student_age) {
		
		// initialize class attribute
		name = student_name;
		major = student_major;
		age = student_age;
	}
	
	// java main class
	public static void main(String[] args) {
		
		// object creation
		ConstrutorWithManyParams obj = new ConstrutorWithManyParams("Qozeem Odeniran", "Information Technology", 28);
		
		// print the class attributes
		System.out.println("Student's Personal Information...");
		System.out.println("Student's Name: " + name);
		System.out.println("Student's Major: " + major);
		System.out.println("Student's Age: " + age);
	}
}
