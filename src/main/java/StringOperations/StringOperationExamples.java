package StringOperations;


public class StringOperationExamples {

    public static void main(String[] args) {


        String lengthOfString = "ABCDEFGUNAOIFNSPIFNAOS";
        String lowerCaseData = "adsiandoiandla";
        String upperCaseData = "ADSIANDOIANDLA";

        String txt = "We are the so-called \"Vikings\" \t from the north.";

        System.out.println(txt);

        String findCharacterIn = "Mint";
//
        int num1 = 10;
        String str1 = "10";
        System.out.println(num1 + Float.parseFloat(str1));
        System.out.println(num1 + str1);

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        //System.out.println(Double.parseDouble(String.valueOf(myInt)));




        System.out.println("length of string = " + lengthOfString.length());

        System.out.println(lowerCaseData.toUpperCase());
        System.out.println(lengthOfString.toLowerCase());


        if(lowerCaseData.equalsIgnoreCase(upperCaseData)){
            System.out.println("data match");
        }
        else{
            System.out.println("data mismatch");
        }

        System.out.println(findCharacterIn.indexOf("t"));
        System.out.println(findCharacterIn.contains("t"));

    char c;
        System.out.println("STR = " +lengthOfString);
        c = lengthOfString.charAt(5);
        System.out.println("CHartAtfunction = " + lengthOfString.charAt(5));
        System.out.println(((Object)c).getClass().getSimpleName());


    }


}
