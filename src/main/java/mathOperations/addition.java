package mathOperations;

import java.util.Scanner;

public class addition {


    Subtraction sub = new Subtraction();
    public static void main(String[] args) {
        int number1, number2, output;
        String str1, str2, strout;
        String result;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please select add,subtract or mul ");
        //userInput.nextLine();
        result = userInput.nextLine();
        System.out.println("Enter the first number ");
        number1 = userInput.nextInt();
        System.out.println("Enter the second number ");
        number2 = userInput.nextInt();


        switch (result) {
            case "add":
                output = addNumbers(number1, number2);
                System.out.println("the addtition of " + number1 + " & " + number2 + " = " + output);
                break;
            case "subtract":
                output = subtractNumber(number1, number2);
                System.out.println("the subtraction of " + number1 + " & " + number2 + " = " + output);
                break;
            case "mul":
                output = multiplyNumber(number1, number2);
                System.out.println("the multiplication " + number1 + "&" + number2 + "=" + output);
                break;
            default:
                System.out.println("Please choose valid option");


        }


//        output = addNumbers(number1, number2);
//        System.out.println("the addtition of " + number1 + " & " + number2 + " = " + output);
//        //subtractNumber(number1, number2);
//        output = multiplyNumber(number1, number2);
//        System.out.println("the multiplication " + number1 + "&" + number2 + "=" + output);
//        strout = concatenate(str1, str2);
//        System.out.println("Concatenation of two strings: " + strout);

//        output = number1 + number2;
//        strout = str1 + str2;
//
//        System.out.println("addition of two numbers = " + output);
//        System.out.println("addition of two strings = " + strout);
    }

    public static int addNumbers(int num1, int num2) {
        int value;
        value = num1 + num2;
        return (value);
    }

    public static int subtractNumber(int num1, int num2) {
        int output;
        output = num1 - num2;
        return (output);
    }

    public static int multiplyNumber(int num1, int num2) {
        int output;
        output = num1 * num2;
        return (output);
    }

    public static String concatenate(String val1, String val2) {
        String result;
        result = val1 + val2;
        return (result);
    }
}
