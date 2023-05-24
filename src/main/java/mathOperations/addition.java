package mathOperations;

public class addition {
    public static void main(String[] args){
        int number1, number2, output;
        String str1, str2, strout;
        number1 = 10;
        number2 = 20;
        str1 = "Aravinth ";
        str2 = "Rajan";


        output = addNumbers(number1, number2);
        System.out.println("the addtition of "+ number1 + " & " +number2 + " = " + output);
        //subtractNumber(number1, number2);



//        output = number1 + number2;
//        strout = str1 + str2;
//
//        System.out.println("addition of two numbers = " + output);
//        System.out.println("addition of two strings = " + strout);
    }

    public static int addNumbers(int num1, int num2){
        int output;
        output = num1+num2;
        return(output);
    }

    public static void subtractNumber(int num1, int num2){
        int output;
        output = num1-num2;
        System.out.println("the subtraction of "+ num1 + " & " +num2 + " = " + output);
    }
}
