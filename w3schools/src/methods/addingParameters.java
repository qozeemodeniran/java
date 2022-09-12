package methods;

public class addingParameters {
	
	static void mySiblings(String fname) {
//		System.out.println(fname + " Odeniran");
	}
	
	static void myIntro(String name, String job, int age ) {
		System.out.println("My name is " + name +
							". I am " + age + " years old" +
							", and I am a " + job + ".");
	}

	public static void main(String[] args) {
		mySiblings("Ahmed");
		mySiblings("Azeezat");
		mySiblings("Azeez");
		mySiblings("Qozeem");
		
		myIntro("Qozeem Odeniran", "Software Developer", 28);
	}

}
