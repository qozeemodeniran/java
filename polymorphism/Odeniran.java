package polymorphism;

class Odeniran {
    protected String lastname = "Odeniran";
    public void members() {
        System.out.println("Odeniran's family tree is along one!");
    }    
}

class Ahmed extends Odeniran {
    private String firstname = "Ahmed";
    public void intro() {
        System.out.println("This is the first son");
    }
}

class Azeezat extends Odeniran {
    private String firstname = "Azeezat";
    public void intro() {
        System.out.println("This is the second daughter");
    }
}

class MainOdeniran {
    public static void main(String arhs[]) {
        Ahmed objAhmed = new Ahmed();
        Azeezat objAzeezat = new Azeezat();

        objAhmed.members();
        objAzeezat.members();
    }
}