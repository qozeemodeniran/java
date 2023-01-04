package datetime;

// import LocalDAteTime class
import java.time.LocalDateTime; 

// import DateTimeFormatter class
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String[] args) {

        // create datetime object and use the now() method to get current date and time
        LocalDateTime datetime = LocalDateTime.now();

        System.out.println("Before formatting: " + datetime);

        // formatting datetime using ofPattern() and format() methods of DateTimeFormtter.
        DateTimeFormatter format_obj = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String formatted_date_time = format_obj.format(format_obj);

        System.out.println("After formatting: " + formatted_date_time);
    }
}