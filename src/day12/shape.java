package day12;

public abstract class shape {

    public abstract void draw();

    public void paint(){
        System.out.println("Shape is painted...");
    }

    public shape(){
        System.out.println("shape is a default consturctor");
    }

}
