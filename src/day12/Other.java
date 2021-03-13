package day12;

import day13.AccessModifierDemo;

public class Other {

    public static void main(String[] args) {

        AccessModifierDemo ob= new AccessModifierDemo();
        // ob.defaultMethod();
        ob.publicMethod();
        //ob.privateMethod();
        //ob.protectedMethod();
        AccessModifierDemoChildd obb= new AccessModifierDemoChildd();
       // obb.protectedMethod();
    }
}
