package polymorphism;

// create super class
class Faculty {

    // super class method(s)
    public void department() {
        System.out.println("\r\nA faculty have at least three department.\r\n");
    }
}

// create sub classes
class IT extends Faculty {
    public void department() {
        System.out.println("\r\nThis is the depratment of Information Technology.\r\n");
    }
}

class CS extends Faculty {
    public void department() {
        System.out.println("\r\nThis is the depratment of Computer Science.\r\n");
    }
}

class MPH extends Faculty {
    public void department() {
        System.out.println("\r\nThis is the depratment of Public Health.\r\n");
    }
}

// java main method with subclasses objects
class Main { 
    public static void main(String[] args) {
        IT objIT = new IT();
        CS objCS = new CS();
        MPH objMPH = new MPH();
    
        // class the parent class method using the subclass objects: THIS IS POLYMORPHISM (one method doing a task in different ways)
        objIT.department();
        objCS.department();
        objMPH.department();
    }
    
}

