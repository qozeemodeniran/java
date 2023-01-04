package date;

// import LocalDate class
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {

        // create date object and use the now() method to get current date
        LocalDate date = LocalDate.now();

        System.out.println("Current date is: " + date);
    }
}