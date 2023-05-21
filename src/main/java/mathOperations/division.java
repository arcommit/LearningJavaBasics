package mathOperations;

import java.util.Scanner;

public class division {
    public static void main(String[] args){
        int num1,num2,result;
        Scanner UserValue = new Scanner(System.in);
        System.out.print("Enter the first number ");
        num1 = UserValue.nextInt();
        System.out.print("Enter the first number ");
        num2 = UserValue.nextInt();
        result = num1/num2;
        System.out.print("The Result is " +result);
    }
}
