package conditionalOperators;

public class ternaryOperatorExample {
    public static void main(String args[])
    {
        int x, y;
        x = 20;
        //variable = (condition) ? expression1 : expression2
        y = (x == 1) ? 61: 90;
        System.out.println("Value of y is: " +  y);
        y = (x == 20) ? 61: 90;
        System.out.println("Value of y is: " + y);
    }
}
