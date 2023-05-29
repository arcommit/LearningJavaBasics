package decisionsAndLoops;

public class LoopExamples {

    public static void main(String[] args) {
        // for loop
        // for(variable = initialize; condition ; increment)

//        for(int i = 0; i<100; i++){
//            System.out.println(i);
//            if(i == 98){
//                System.out.println("I am 98. I will kill 99");
//                for(int j = 100; j<102; j++) {
//                    System.out.println(j);
//                    if(j == 100){
//                    break;}
//                }
//            }
//        }
        int i = 100;
//        while(i < 100){
//            System.out.println(i);
//            i++;
//            i = i + 1;
//
//        }

        do{
            System.out.println(i);
            i++;
            i = i + 1;
        }
        while(i < 100);



    }
}
