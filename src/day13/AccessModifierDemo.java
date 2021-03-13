package day13;

public class AccessModifierDemo {

    String defaultVAr= "this is default variable";
    public String publicVar="this is public variable";
    private String privateVar= "this is private variable";
    protected String protectedVar= "this is protected variable";

    void defaultMethod(){
        System.out.println("this is default method");
    }

    public void publicMethod(){
        System.out.println("this is public method");
    }

    private void privateMethod(){
        System.out.println("this is private method");
    }

    protected void protectedMethod(){
        System.out.println("this is protected variable");
    }

    public AccessModifierDemo(){
        System.out.println("public constructor");

    }

     AccessModifierDemo(int a){
        System.out.println("public constructor");

    }

    private AccessModifierDemo(int a, int b){

    }

    protected AccessModifierDemo(String s){
        System.out.println("protected constructor");
    }

    public static void main(String[] args) {

        AccessModifierDemo ob= new AccessModifierDemo(4, 5);
        ob.defaultMethod();
        ob.publicMethod();
        ob.privateMethod();
        ob.protectedMethod();

    }





}
