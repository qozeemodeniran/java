package hashset;
import java.util.HashSet;

// creating HashSet object, and add items to HashSet using the add() method
class Main {
    public static void main(String[] args) {
        HashSet<String> majors = new HashSet<String>();
        majors.add("IT");
        majors.add("CS");
        majors.add("MPH");
        majors.add("MPH");
        majors.add("SOC");
        majors.add("ENG");
        majors.add("ENG");

        System.out.println(majors);
        /**
        "MPH" and "ENG" were added twice but only appears once in the output. This is to show that HashSet isa collection of unique items.
        */

        // check if an item exists in the collection using contains() method
        System.out.println(majors.contains("PSY"));

        // remove an item using remove() method, use clear() to remove all items
        majors.remove("ENG");
        System.out.println("New Collection: " + majors);

        // gett the size of an HashSet using size() method
        System.out.println("Size of HashSet is: " + majors.size());

        // loop through hashset items using for-each loop
        for(String i: majors) {
            System.out.println(i);
        }
    }
}