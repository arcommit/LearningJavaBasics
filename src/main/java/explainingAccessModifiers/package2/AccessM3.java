package explainingAccessModifiers.package2;

import explainingAccessModifiers.package1.AccessM1;
import explainingAccessModifiers.package1.AccessM2;

public class AccessM3 extends AccessM1{

    public static void main(String[] args) {
        AccessM1 am3 = new AccessM1();
        System.out.println("date = " + am3.getDate());
        System.out.println("date = " + am3.getMonth());
    }
}
