package methods;

public class ifElse {
	
	static void checkMajor(String major) {
		
		if(major == "Computer Scicence" || major == "Information Technology") {
			System.out.println("You can apply for this job!");
		} else {
			System.out.println("Sorry, we need someone from the IT or CS major.");
		}
	}

	public static void main(String[] args) {
		checkMajor("Business Administration");
	}

}
