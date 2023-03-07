package files;

import java.io.File;

public class File4 {
    public static void main(String[] args) {
        // deleting file
        File file = new File("../dummy.txt");
        if (file.delete()) {
            System.out.println("The file " + file.getName() + " has been deleted");
        } else {
            System.out.println("Unable to delete file.");
        }

        // deleting a folder
        File folder = new File("./dummy");
        if(folder.delete()) {
            System.out.println("The folder " + folder.getName() + " has been deleted.");
        } else {
            System.out.println("unable to delete folder.");
        }
    }
}
