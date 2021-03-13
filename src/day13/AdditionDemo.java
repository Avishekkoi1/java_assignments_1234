package day13;

public class AdditionDemo {

    public void sum(int a, int b){
        int r=a+b;
        System.out.println("1. sum is: "+r);
    }

    public void sum(int a, int b, int c){
        int r=a+b;
        System.out.println("2. sum is: "+r);
    }

    public void sum(double a, double b){
        double r=a+b;
        System.out.println("1. sum is: "+r);
    }

    public static void main(String[] args) {
        //compile time [polymorphism(static binding)
        //which can be achieved by overloading of method
        AdditionDemo obj= new AdditionDemo();
        obj.sum(4,5);
        obj.sum(4,5,5);
        obj.sum(4.5,5.5);


    }

}
