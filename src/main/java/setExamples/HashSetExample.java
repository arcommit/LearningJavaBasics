package setExamples;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        HashSet<Integer> nums = new HashSet<Integer>();

        nums.add(1);
        nums.add(3);

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        cars.remove("BMW");

        for(String car : cars){
            System.out.println(car);
        }

        System.out.println(cars.contains("BMW"));

        System.out.println(nums);

    }
}
