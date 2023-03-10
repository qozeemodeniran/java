package java_how_to;

public class Reverse {
    public static void main(String[] args) {
        // reverse a string
        String original = "Qozeem Odeniran";
        String reversed = "";

        for (int i=0; i<original.length(); i++) {
            reversed=original.charAt(i) + reversed;
        }

        System.out.println("The reversed string of 'Qozeem Odeniran is: '" + reversed);
    } 
}