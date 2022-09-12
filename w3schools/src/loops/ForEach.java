package loops;

public class ForEach {
	public static void main(String[] args) {
		String[] names = {"Qozeem", "Banji", "Odeniran"};
		
		for(String name : names) {
			if(name == "Banji") {
//				continue;
//				break;
			}
			System.out.println(name);
		}
	}
}
