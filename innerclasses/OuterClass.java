package innerclasses;

// create outerclass
class Outerclass {
    int outer = 101;

    /*
    Unlike a regular class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:

    An inner class can also be static, which means that you can access it without creating an object of the outer class:
    */
    class Innerclass {
        int inner = 231;
    }
}

class Main {
    public static void main(String[] args) {

        // create object of outer class
        Outerclass outerOBJ = new Outerclass();

        // create object of inner class
        Outerclass.Innerclass innerOBJ = outerOBJ.new Innerclass();

        // access properties of outer and inner classes via objects
        System.out.println(innerOBJ.inner + outerOBJ.outer);
    }
}
