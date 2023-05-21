package conditionalOperators;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "London";
        String str2 = "Beautiful";
        String str3;

        // Q1 - Compare if two strings are alike

System.out.println(str1==str2);
        // Q2 - combine two strings and store it in 3rd variable. print the new variable
        str3 = str1+str2;
        System.out.println(str3);

        //Q3 - use the two variables and print the output like "London is Beautiful"
        System.out.print(str1+" is "+str2);


    }
}
