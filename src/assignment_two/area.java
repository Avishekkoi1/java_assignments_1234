package assignment_two;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        double PI= 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a circle: ");
        double r= input.nextDouble();
        double Area= (double) (PI*r*r);


        System.out.println("Enter the length of a rectangle: ");
        double l= input.nextDouble();
        System.out.println("Enter the width of a rectangle: ");
        double w= input.nextDouble();
        double Area_r= (double) (l*w);


        System.out.println("Enter the base of a triangle: ");
        double b= input.nextDouble();
        System.out.println("Enter the height of a triangle: ");
        double h= input.nextDouble();
        double Area_t= (double) (0.5*b*h);

        System.out.format("The area of the circle is: %.2f\n", Area);
        System.out.format("The area of the rectangle is: %.2f\n", Area_r);
        System.out.format("The area of the triangle is: %.2f\n", Area_t);



    }
}
