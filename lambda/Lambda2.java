package lambda;
/*
- We can store lambda expressions in variables provided the variable's type is an interface that has just one method.

- This lambda expression must have the same number of parameters, s well as same return type of that method.

- 'Consumer' is one of the many built-in java interfaces used by lists
*/

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        // using 'Consumer' interface  to store lambda expression in a variable
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);
    }
}