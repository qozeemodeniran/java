package iterator;

import java.util.ArrayList;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Qozeem");
        names.add("Banji");
        names.add("Odeniran");

        // geting iterator
        Iterator<String> it = names.iterator();

        // print first item using the next() method
        System.out.println("The firt item of the ArrayList is: " + it.next());

        // looping through the collection using the hasNext() and next() methods of the Iterator class
        System.out.println("Looping through the Arraylist");
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}