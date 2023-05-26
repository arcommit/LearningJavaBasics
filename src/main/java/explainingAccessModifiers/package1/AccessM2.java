package explainingAccessModifiers.package1;

import explainingAccessModifiers.package2.AccessM3;

public class AccessM2{
    public static void main(String[] args) {

        AccessM1 am2 = new AccessM1();
        System.out.println(am2.date);
        System.out.println(am2.month);


//        AccessM1 am1 = new AccessM1();
//        System.out.println("date = " + am1.date);
//        System.out.println("date = " + am1.month);
//
//        AccessM3 am3 = new AccessM3();
//        System.out.println("date = " + am3.date);
//        System.out.println("date = " + am3.month);
    }
}
