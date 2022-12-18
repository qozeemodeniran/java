package arrays;

public class StringAndIntArray {
	public static void main(String[] args) {
		// String array
		String[] names = {"Qozeem", "Banji", "Odeniran"};
		
		// Integer array
		int[] numbers = {101, 231, 1927};
		
//		System.out.println(names[0]);
		
		// change "Banji" to "Oluwadamilare"
		names[1] = "Oluwadamilare";
//		System.out.println(names[1]);
		
		// get the length of names
//		System.out.println(names.length);
		
		// loop through an array with for-loop
		for(int i=0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
		}
		
		// loop through an array using for-each loop
		for (String i: names) {
			System.out.println(i);
		}
	}
}
