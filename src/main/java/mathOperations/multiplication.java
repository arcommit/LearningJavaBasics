package mathOperations;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
      int number1,number2,output;
      Scanner UserInput = new Scanner(System.in);
      System.out.print("Enter the first number ");
      number1 = UserInput.nextInt();
      System.out.print("Enter the second number ");
      number2 = UserInput.nextInt();
      output = number1*number2;
      System.out.print("Multiplied value is "+output);
    }
}
