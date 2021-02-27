package assignment_5;

import java.util.Scanner;

public class Ninteen_Number {

    public static String triangle_type(double a, double b, double c){

        if(a==b && b==c){
            String type= "equilateral triangle";
            return type;
        }else if(a==b || b==c || a==c){
            String type="isosceles triangle";
            return type;
        }else{
            String type="Scalene triangle";
            return type;
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first side of a triangle: ");
        double a= input.nextDouble();
        System.out.println("Enter the second side of the triangle: ");
        double b= input.nextDouble();
        System.out.println("Enter the third side of the triangle: ");
        double c= input.nextDouble();

        String type=  triangle_type(a, b, c);
        System.out.println("The type is: "+type);


    }
}
