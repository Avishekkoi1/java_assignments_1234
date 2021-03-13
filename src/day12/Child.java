package day12;

public class Child extends Parent {

    String name= "child's name";

    public void sayHello(){
        System.out.println("Hello from child...");
        super.sayHello();
        System.out.println(name);
        System.out.println(super.name);
    }
}
