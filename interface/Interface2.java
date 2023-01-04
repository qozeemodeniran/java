package myinterface;

// declare multiple interfaces
interface Faculty {

    public void fac_name();
}

interface Department {

    public void dept_name();
}

// implement multiple interfaces
class Student implements Faculty, Department {

    public void fac_name() {

        System.out.println("College of Engineering and Technology");
    }

    public void dept_name() {

        System.out.println("Information Technology");
    }

}

class Main {

    public static void main(String[] args) {

        Student obj = new Student();

        obj.fac_name();
        obj.dept_name();
    }
}