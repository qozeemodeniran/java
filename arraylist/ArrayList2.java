package arrlist2;

import java.util.ArrayList;

// import Collections to be able to sort ArrayList using sort() method
import java.util.Collections;

class Main {
    public static void main(String[] args) {

        // String
        ArrayList<String> names = new ArrayList<String>();
        names.add("Qozeem");
        names.add("Banji");
        names.add("Odeniran");

        /** 
        To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
        */
        ArrayList<Integer> info = new ArrayList<Integer>();
        info.add(28);
        info.add(3);
        info.add(18);
        info.add(33);
        info.add(27);
        info.add(12);

        System.out.println("Integer ArrayList = " + info);

        System.out.println("Sorting Integer ArrayList");
        Collections.sort(info);
        for (int num : info) {
            System.out.println("Sorted ArrayList = " + num);
        }
        
        System.out.println("Sorting String ArrayList");
        Collections.sort(names);
        for (String str : names) {
            System.out.println("Sorted ArrayList = " + names);
        }



        // looping through arraylist using for-loop, and array size to specify howmany times loop should run
        System.out.println("Looping with for-loop");
        for(int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }

        // looping though arraylist with foreach
        System.out.println("Looping with foreach-loop");
        for (String j : names) {
            System.out.println(j);
        }
    }
}