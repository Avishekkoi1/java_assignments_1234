package day6;

public class MethodDemo {
    //method declaration
    public void sayHello(){
        System.out.println("hello from Nepal");
    }

    public void displayInfo(String name, int age, double salary){
        System.out.println("Name is: " +name);
        System.out.println("Age is: " +age);
        System.out.println("Salary is: " +salary);
    }

    public static void main(String[] args) {
        System.out.println("main");
        //method calling
        MethodDemo ob = new MethodDemo();
        ob.sayHello();


        ob.displayInfo("Ram", 22, 567.45);

        String n = "shyam";
        int a= 11;
        double s= 234.45;
        ob.displayInfo(n, a, s);

        System.out.println("main end");
    }
}
