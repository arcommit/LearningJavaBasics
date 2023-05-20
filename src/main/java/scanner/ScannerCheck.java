package scanner;

import java.util.Scanner;

public class ScannerCheck {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = userInput.nextLine();

        System.out.print("Enter your age: ");
        int age = userInput.nextInt();
        System.out.println("Your name is " + name + " and you are " + age + " years old.");
    }
}
