package day12;

public class Derived extends Base {

    public Derived(){
        super(5);
        System.out.println("derived child default consturctor");
    }

    public Derived(int a){
        super();
        System.out.println("This is augmented constructor");
    }
}
