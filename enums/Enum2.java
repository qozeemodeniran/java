package enums;

// Enum in class
public class Enum2 {

    enum Position {

        FIRST, SECOND, THIRD
    }

    public static void main(String[] args) {

        Position pos = Position.FIRST;
        System.out.println(pos);
    }
}