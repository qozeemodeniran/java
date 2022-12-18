package strings;

public class Strings {
	public static void main(String[] args) {
//		----------------String Length-------------
		String firstname = "Qozeem";
		System.out.println("The length of my firstname is: " + firstname.length());
		
//		---------------String uppercase and lowercase-----------
		String lastname = "Odeniran";
		System.out.println("I am printing my lastname " + lastname + ", in uppercase: " + lastname.toUpperCase());
		System.out.println("I am coverting it back to lowercase: " + lastname.toLowerCase());
		
//		-----------------String Concatenation--------------
		String fullname = firstname.concat(" "+lastname);
		System.out.println("My fullname is: " + fullname);
	}
}
