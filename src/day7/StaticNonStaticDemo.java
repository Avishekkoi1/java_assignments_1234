package day7;

public class StaticNonStaticDemo {

    String nonStaticVar= "this is non-static variable";
    static String staticVar= "this is static variable";

    public void nonStaticMethod(){
        System.out.println("This is non-static method...");
        int a = 5;
        String name= "ram";
    }

    public static void staticMethod(){
        System.out.println("This is static method...");
        //local variable
        int a= 5;
        String name= "ram";

    }

    public static void main(String[] args) {
        int a= 5;
        String name= "ram";

        StaticNonStaticDemo ob= new StaticNonStaticDemo();
        System.out.println(ob.nonStaticVar);
        ob.nonStaticMethod();

        //best way
        System.out.println(StaticNonStaticDemo.staticVar);
        StaticNonStaticDemo.staticMethod();


    }

}
