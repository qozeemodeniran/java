package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Odeniran", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("The name of the programmer is Banji Odeniran");

        boolean foundAmatch = matcher.find();
        if(foundAmatch) {
            System.out.println("Found a match");
        } else {
            System.out.println("No match found");
        }
    }
}