package fileManipulations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        try{
            File myFile = new File("C:\\Dev\\playground\\java_projects\\LearningJavaBasics\\src\\main\\java\\fileManipulations\\data6.txt");
            FileWriter writeMyFile = new FileWriter("C:\\Dev\\playground\\java_projects\\LearningJavaBasics\\src\\main\\java\\fileManipulations\\data5.txt");
            writeMyFile.write("This is file writer in java 1.");
            writeMyFile.append("This is file writer in java 2.");
            writeMyFile.close();
            try{
                Scanner myReader = new Scanner(myFile);
                while(myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            }
            catch (FileNotFoundException e) {
                System.out.println("File Not Found " + e);
            }
            finally {
                System.out.println("final 1");
            }

        }

        catch(IOException e){
            System.out.println("File Not Found");
        }
        finally {
            System.out.println("final 2");
        }


    }
}
