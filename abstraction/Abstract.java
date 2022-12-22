package abstraction;

// create abstract class
abstract class Student {

    // create abstract method: does not have  body
    public abstract void lastname();

    // create a regular method
    public void grade() {
        System.out.println("A+");
    }
}

// create a subclass
class Qozeem extends Student {
    public void lastname() {

        // provide the body of the lastname() here
        System.out.println("Odeniran");
    }
}

class Main {
    public static void main(String[] args) {
        Qozeem student1 = new Qozeem();
        student1.lastname();
        student1.grade();
    }
}