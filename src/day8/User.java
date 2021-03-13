package day8;

public class User {

    String name;
    int age;
    //number of args, sequence of args, type of args
    public User(){
        System.out.println("default(non-arg) constructor.");
    }

    public User(String n, int a){
        name=n;
        age=a;
        System.out.println("argument(Parameterized) constructor");
    }
    public static void main(String[] args) {
        User user1= new User();
        User user2= new User("ram", 35);
    }
}
