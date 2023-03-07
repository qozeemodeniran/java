package files;

import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {

        // creating file
        try {
            File file = new File("../dummy.txt");
            if(file.createNewFile()) {
                System.out.println("File successfully created! Filename: " + file.getName());
            } else {
                System.out.println("File exists.");
            }
        } catch (IOException e) {
            System.out.println("Failed!, an error occured while trying to create intended file");
            e.printStackTrace();
        }
    }
}