package time;

// import LocalTime class
import java.time.LocalTime;

class Main {
    public static void main(String[] args) {

        // create time object and use the now() method to get current time
        LocalTime time = LocalTime.now();

        System.out.println("Current time is: " + time);
    }
}