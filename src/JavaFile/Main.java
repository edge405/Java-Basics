package JavaFile;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file =  new File("exampleFile.txt");

        if (file.exists()){
            System.out.println("file name is " + file.getName() + " \nis it file? : " + file.isFile());
        } else {
            System.out.println("File doesn't exist");
        }

        file.delete();
    }
}
