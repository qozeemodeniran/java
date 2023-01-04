package enums;

enum Level {
  LOW,
  MEDIUM,
  HIGH
}

// loop through enum
public class Enum4 { 
  public static void main(String[] args) {
    /**
    The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:
    */
    for (Level myVar : Level.values()) {
      System.out.println(myVar);
    }
  } 
}

