package fileManipulations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExamples {
    public static void main(String[] args) throws IOException {
        File myFile = new File("C:\\Dev\\playground\\java_projects\\LearningJavaBasics\\src\\main\\java\\fileManipulations\\data5.txt");
        FileWriter writeMyFile = new FileWriter("C:\\Dev\\playground\\java_projects\\LearningJavaBasics\\src\\main\\java\\fileManipulations\\data5.txt");
        System.out.println(myFile.createNewFile());

        if(myFile.createNewFile()){
            System.out.println("File has been created with name " + myFile.getName());
        }
        else{
            System.out.println("File already exists");
        }

        writeMyFile.write("This is file writer in java 1.");
        writeMyFile.append("This is file writer in java 2.");
        writeMyFile.close();
    }
}
