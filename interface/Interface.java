package myinterface;

// create an interface
interface Car {

    // interface methods without bodies
    public void brand();
    public void model();
}

// create implements of interface: kinda child class
class Ford implements Car {

    // provide body for methods in the interface here
    public void brand() {
        System.out.println("Car Name: Ford");
    }

    public void model() {
        System.out.println("Car Model: Fussion");
    }
}

class Main {
    public static void main(String[] args) {

        // create Ford object
        Ford ford = new Ford();
        
        // access methods with objects
        ford.brand();
        ford.model();
    }
}

