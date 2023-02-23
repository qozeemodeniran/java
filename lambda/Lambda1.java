package lambda;
/*
- Lambda Expression is a short code that takes in parameters and returns a value.
- Although, they are somewhat like a method, but just that they do not need a name, and can be rigth in the body of a method.

- Expressions are limited, so they have to immediately return a value. Also, they cannot contain variables, assignments or statement like 'for' or 'if'.

- Code block can be used with {curly braces} in order to do more complex operations. The code block should have a 'return' statememnt of the lambda expression needs to return a value

Syntax:
1. parameter -> expression
2. (parameterA, parameterB) -> expression
3. (parameterA, parameterB) -> {code block}
*/

// Lambda expressions are usually passed as parameters to a function
import java.util.ArrayList;


public class Lambda1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        // using lambda in the ArrayList's forEach() method to print each item in the list
        numbers.forEach( (n) -> {
            System.out.println(n);
        });
    }
}