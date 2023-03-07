package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class File3 {
    public static void main(String[] args) {
        // reading file
        try {
            File file = new File("../file1.txt");
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                System.out.println(data);

            }
            // getting more information about the file
            if (file.exists()) {
                // get file name
                System.out.println("File name: " + file.getName());
                // get file path
                System.out.println("Absolute file path: " + file.getAbsolutePath());
                // check if file is writable
                System.out.println("Writable: " + file.canWrite());
                // check if file is readable
                System.out.println("File name: " + file.canRead());
                // get file size in bytes
                System.out.println("File name: " + file.length());
            } else {
                System.out.println("File does not exist.");
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
