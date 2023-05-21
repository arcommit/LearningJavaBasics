package decisionsAndLoops;

public class IfElseIfExample {
    public static void main(String[] args) {
        String city = "Delhi";
        if(city == "Meerut") {
            System.out.println("city is meerut");
        }else if (city == "Noida") {
            System.out.println("city is noida");
        }else if(city == "Agra") {
            System.out.println("city is agra");
        }else {
            System.out.println(city);
        }

        if(city=="Delhi"){
            System.out.println("The city is delhi. it's beautiful");
        }

        if(city == "Delhi"){
            System.out.println("This is delhi!");
        }

        if(city != "Delhi"){
            System.out.println("This is not delhi!");
        }
    }
}
