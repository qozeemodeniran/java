package hashmap;

import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        /**
        Create a HashMap object called capitalCities that will store String keys and String values
        */ 
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        /** Add item to HashMap using the put() method */
        capitalCities.put("Nigeria", "Lagos");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("England", "London");
        capitalCities.put("Norway", "Oslo");

        System.out.println(capitalCities);
        System.out.println("The initial size of the hashmap is: " + capitalCities.size());
    
        /** use the get() method to access an item using its key */
        System.out.println("The capital of Nigeria is: " + capitalCities.get("Nigeria"));

        /** remove an item using remove() method using its key, then print the new list. (use clear() method to remove all items)*/
        capitalCities.remove("England");
        System.out.println("The result after remove England is: " + capitalCities);

        /** use size() to get the size (how many items) of the hashmap */
        System.out.println("The new size of the hashmap is: " + capitalCities.size());

        /** Looping through the items of a HashMap usinf for-each loop: we can decide to print Keys or Values. 
        For printing keys, use keySet() methods, and use values() for prinitng values.
        */
        System.out.println("The Keys are:");
        for (String k : capitalCities.keySet()) {
            System.out.println(k);


        }

        System.out.println("The Values are:");
        for (String v: capitalCities.values()) {
            System.out.println(v);
        }

        /** Priniting Keys and values together */
        System.out.println("Priniting Keys and values together:");
        for (String kv : capitalCities.keySet()) {
            System.out.println("Key: " + kv + ", Value: " + capitalCities.get(kv));
        }
    }
}



