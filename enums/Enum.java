package  enums;

// CREATE ENUM
enum Degree {
    FIRSTCLASS,
    SECONDCLASS,
    THIRDCLASS,
    PASS
}

// ACCESS ENUM
class Main {
    public static void main(String[] args) {
        Degree result = Degree.FIRSTCLASS;

        System.out.println(result);
    }
}
