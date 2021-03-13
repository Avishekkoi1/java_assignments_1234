package day8;

public class Student {
    String name;
    int roll;

    /*public void assignInfo(String n, int r){
      //  name= n;
       // roll=r;
    }*/
    public Student(String n, int r){
        name=n;
        roll=r;
    }
    public void displayInfo(){
        System.out.println("Name is: "+name);
        System.out.println("Roll is: "+roll);
    }



    public static void main(String[] args) {

        Student student1= new Student("Shyam", 55);

        student1.displayInfo();

        System.out.println("=================");
        Student student2= new Student("Ram", 35);

        student2.displayInfo();


    }
}
