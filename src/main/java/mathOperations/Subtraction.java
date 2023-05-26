package mathOperations;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int number1,number2,output;
        System.out.print("Enter the first number ");
        number1 = userInput.nextInt();
        System.out.print("Enter the second number");
        number2 = userInput.nextInt();
        output = number1 - number2;
        System.out.print("The subtracted value is "+ output);
    }
    public static int subNum(int num1, int num2) {
        int output;
        output = num1 - num2;
        return (output);
    }
}
