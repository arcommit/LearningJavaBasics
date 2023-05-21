package decisionsAndLoops;

public class IfStatementExample {
    enum Level1 {
        LOW,
        MEDIUM,
        HIGH
    }


    public static void main(String[] args) {
        String str1 = "   London  ";
        String str2 = " london";
        String str3;


        Level1 myEnumVar = Level1.MEDIUM;
        Level1 myEnumVar2 = Level1.HIGH;
        System.out.println(myEnumVar);
//        str1 = str1.trim();
//        str2 = str2.trim();
//        System.out.println(str1.toUpperCase().contains("O"));

        // Q1 - Compare if two strings are alike
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("The two strings are alike");
        }
        else{
            System.out.println("The two strings are unique and don't match");
        }

        // Q2 - combine two strings and store it in 3rd variable. print the new variable
        str3 = str1+str2;
        System.out.println(str3);

//        //Q3 - use the two variables and print the output like "London is Beautiful"
//        System.out.print(str1+" is "+str2);
    }
}
