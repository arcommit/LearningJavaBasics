package conditionalOperators;

import java.sql.SQLOutput;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "London";
        String str2 = "Beautiful";
        String str3;

        // London , Beautiful - split on o
        // L
        //nd
        //n , Beautiful

        // Q1 - Compare if two strings are alike

        System.out.println(str1 == str2);
        // Q2 - combine two strings and store it in 3rd variable. print the new variable
        str3 = str1 + " , " + str2;
        System.out.println(str3);

        //Q3 - use the two variables and print the output like "London is Beautiful"
        System.out.println(str1 + " is " + str2);

       System.out.println(str3.split("o")[1]);
       System.out.println(str3.split("o")[2]);
//        System.out.println(str3.split(",")[0] + str3.split(",")[1]);
//        String str4 = str1.concat(str2);
//        System.out.println(str4.length());
//        System.out.println(str4.contains("L"));
//        String str4 = str1.concat(str2);
//        str4 = "  ";
        //      System.out.println(str4.isBlank());
//        System.out.println(str4.isEmpty());
        //       str4 = null;
//        System.out.println(str4 == null);


    }
}
