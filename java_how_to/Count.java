package java_how_to;

public class Count {
    public static void main(String[] args) {
        // count the number of words in a string
        String str = "Hey, the words int this senetence will be counted.";

        int count = str.split("\\s").length;

        System.out.println("The number of words in the string is: " + count);
    }
}