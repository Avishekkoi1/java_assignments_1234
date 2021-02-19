package assignment_two;

import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        double PI= 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a circle: ");
        double r= input.nextDouble();
        double Perimeter= (double) (2*PI*r);


        System.out.println("Enter the length of a rectangle: ");
        double l= input.nextDouble();
        System.out.println("Enter the width of a rectangle: ");
        double w= input.nextDouble();
        double Perimeter_r= (double) (2*(l+w));


        System.out.println("Enter one side of a triangle: ");
        double l1= input.nextDouble();
        System.out.println("Enter the second side of the triangle: ");
        double l2= input.nextDouble();
        System.out.println("Enter the third side of the triangle: ");
        double l3= input.nextDouble();
        double Perimeter_t= (double) (l1+l2+l3);

        System.out.format("The area of the circle is: %.2f\n", Perimeter);
        System.out.format("The area of the rectangle is: %.2f\n", Perimeter_r);
        System.out.format("The area of the triangle is: %.2f\n", Perimeter_t);


    }
}
