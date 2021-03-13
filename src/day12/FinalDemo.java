package day12;

//can not over-ride final method or class
//can not use final for constructor
public class /*final*/ FinalDemo {

    //final int a=5;
    final int a;
    public void sayHello(){
        System.out.println("hello from parent...");
    }

    public FinalDemo(int a){
        this.a=a;
    }
}
