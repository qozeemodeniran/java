package arrlist;

// import ArrayList class
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        // create ArrayList object htat will store string values
        ArrayList<String> names = new ArrayList<String>();

        // use add() method to add item to array:
        names.add("Qozeem");
        names.add("Banji");
        names.add("Odeniran");

        // // edit second item using set() method
        // names.set(1, "Oluwabamiji");

        // // remove item using remove() method
        // names.remove(1);

        // // remove all items uding clear() method
        // names.clear();

        // output ArrayList
        System.out.println(names);

        // // access an item using get() method
        // System.out.println("My firstname is " + names.get(0));

        // // output editted item
        // System.out.println("I changed my middlename to: " + names.get(1));

        // // output result after removind an item item
        // System.out.println("My middle name has been removed, and here is the new array list" + names);

        // // output cleared array
        // System.out.println("All items have been cleared from array list" + names);

        // get the number of element in array using the size() method
        System.out.println("Number of array item is: " + names.size());

    }
}