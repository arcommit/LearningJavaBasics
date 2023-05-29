package fileManipulations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWithTryCatchExample {
    static Scanner myReader;
    public static void main(String[] args) {
        File myFile = new File("C:\\Dev\\playground\\java_projects\\LearningJavaBasics\\src\\main\\java\\fileManipulations\\data5.txt");

        try {
            myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found " + e);
        }
        finally {
            System.out.println("final 1");
            myReader.close();
        }
    }

}
