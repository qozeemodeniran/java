package innerclasses;

// One advantage of inner classes, is that they can access attributes and methods of the outer class

class Outerclass2 {
    int x = 101;

    class Innerclass {
        public int InnerMethod() {
            return x;
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Outerclass2 outerOBJ = new Outerclass2();
        Outerclass2.Innerclass innerOBJ = outerOBJ.new Innerclass();

        System.out.println(innerOBJ.InnerMethod());
    }
}