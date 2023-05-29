package mapsExample;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        //add values
        capitalCities.put("England", "London");
        capitalCities.put("Scotland", "Edinburgh");

       // System.out.println(capitalCities);
        //System.out.println(capitalCities.get("England"));
//        System.out.println(capitalCities.remove("England"));
//        System.out.println(capitalCities);
     //   System.out.println(capitalCities.size());

        for(String cities : capitalCities.keySet()){
           //System.out.println(cities);
            System.out.println("Capital of " + cities + " is " + capitalCities.get(cities));
        }

        capitalCities.put("England", "Bristol");
        capitalCities.put("england", "london");

        for(String cities : capitalCities.keySet()){
            //System.out.println(cities);
            System.out.println("Capital of " + cities + " is " + capitalCities.get(cities));
        }

//        for(String cities : capitalCities.values()){
//            System.out.println(cities);
//        }



    }
}
