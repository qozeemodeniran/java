package MultipleClassesInSingleFile;

public class MultipleClassesInSingleFile {
	public static void main(String[] args) {
		// First create the external classes, then call them here.
		System.out.println(FirstMessage.firstMessage());
		System.out.println(SecondMessage.secondMessage());
	}
}

class FirstMessage {
	static String firstMessage() {
		return "Here is my first messsage";
	}
}

class SecondMessage {
	static String secondMessage() {
		return "This is my second message";
	}
}
