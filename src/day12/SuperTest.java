package day12;

public class SuperTest {

    public static void main(String[] args) {
       //implicit type casting
        Super obj= new sub();
        obj.sayHello();

        //explicit type casting
        Super ob= new Super();
        sub suub= (sub)ob;


    }
}
