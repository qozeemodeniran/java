package wrapper;

class Wrapper {
    public static void main(String[] args) {
        // create Wrapper class: gives opportunity to use primitive datatypes as objects
        Integer myint = 28;
        Double mydouble = 101.4;
        Character mychar = 'Q';
        // print out the values
        System.out.println(myint);
        System.out.println(mydouble);
        System.out.println(mychar);

        // leveraging on the Wrapper class methods
        System.out.println(myint.intValue());
        System.out.println(mydouble.doubleValue());
        System.out.println(mychar.charValue());

        // converting an integer to string and using the length() method of the String class to output the length
        String mystring = myint.toString();
        System.out.println(mystring.length());
    }
}