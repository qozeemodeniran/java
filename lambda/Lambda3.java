package lambda;

/*
- in order to use a lambda expression in a method, the method must have a parameter with a single-method interface s its type.

- The lambda expression would be implemented by calling the interface's method.
*/

// interface definition
interface StringFunction {
    String run(String str);
}

public class Lambda3 {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";

        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    // creating a method that takes lambda expression as a parameter
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}