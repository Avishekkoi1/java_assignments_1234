package day9;
//shadowing: hiding instance variable by local variable
//inside non-static method and constructor of a class
public class ThisDemo1 {

    int a=5;
    public void print(){

        System.out.println(a);
        //local variable
        int a=6;
        System.out.println(a);
        int sum=a+a;
        System.out.println("sum: "+sum);

        sum= this.a+a;
        System.out.println("sum: "+sum);
    }
    public static void m1(){
        ThisDemo1 ob= new ThisDemo1();
        System.out.println(ob.a);
        int a=6;
    }

    public static void main(String[] args) {
        ThisDemo1 ob1= new ThisDemo1();
        System.out.println("ob1 is: "+ob1);
        ob1.print();
    }
}
