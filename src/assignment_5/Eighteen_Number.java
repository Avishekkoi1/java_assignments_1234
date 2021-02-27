package assignment_5;

public class Eighteen_Number {

    public static double greatestValue(double a, double b, double c){
        double greatest_value=0;
        if(a>=b && (b>c||b==c)){
            greatest_value=a;
        }else if(b>=a && (c>b||b==c)){
            greatest_value=c;
        }else{
            greatest_value=b;
        }
        return greatest_value;

    }
    public static void main(String[] args) {
        double a = greatestValue(20, 50, 20);
        System.out.println("The greatest value is: "+a);

    }
}
