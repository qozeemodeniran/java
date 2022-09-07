package ifElse;

public class IfElse {
	public static void main(String[] args) {
		int a, b;
		a = 5;
		b = 7;
		
//		------------if statement--------------
		if(a < b) {
//			System.out.println(a + " is less than " + b);
		}
		
//		-----------else statement-----------------
		int age = 12;
		if(age >= 18) {
//			System.out.println("You are an adult");
		} else {
//			System.out.println("You are not an adult");
		}
		
//		--------------else..if------------------
		int time = 22;
		if(time < 10) {
//			System.out.println("Top of the morning");
		} else if( time < 20) {
//			System.out.println("Good day");
		} else {
//			System.out.println("Good evening");
		}
		
//		------------if..else / tenary operation-------------
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
	}
}
