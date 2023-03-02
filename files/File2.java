package files;

import java.io.FileWriter;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) {

        // writing to file
        try {
            FileWriter file = new FileWriter("../file1.txt");
            file.write("Hey, the FileWriter class is usedd to write to file in java.\r\nKnow this and know peace");
            file.close();
            System.out.println("You successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Failed! An error occured when trying to write to file.");
            e.printStackTrace();
        }
    }
}