package listsExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListOperations {
    public static void main(String[] args) {

        ArrayList<String> newArrayList = new ArrayList<String>();
        ArrayList<Integer> newIntArray = new ArrayList<Integer>();
        String str = "str1";

        newArrayList.add("value1");
        newArrayList.add(str);
        newArrayList.add("value33");
        newArrayList.add("value7");
        newArrayList.add("value10");
        newArrayList.add("value16");
        newArrayList.add("value1");

        newIntArray.add(1);
        newIntArray.add(3);
        newIntArray.add(2);
        newIntArray.add(10);
        newIntArray.add(7);

        System.out.println(newArrayList);
        newArrayList.set(2,"str2");
        //newArrayList.set(7,"str2");
        System.out.println(newArrayList);
        newArrayList.remove(5);
        //Collections.sort(newArrayList);
        System.out.println(newArrayList);

       System.out.println(newArrayList.size());
//        System.out.println(newArrayList.get(0).length());
//        System.out.println(newArrayList.get(3));

//        for(int i=0;i< newArrayList.size();i++){
//            System.out.println(newArrayList.get(i));
//        }

        for(String data : newArrayList){
            System.out.println(data);
        }
//
//        System.out.println(newIntArray);
//        Collections.sort(newIntArray);
//        System.out.println(newIntArray);







    }
}
