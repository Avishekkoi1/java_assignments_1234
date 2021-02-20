package assignment_3;

import java.lang.Math;
import java.util.Scanner;

public class Tenb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of s: ");
        double s= input.nextDouble();
        System.out.println("Enter the value of a");
        double a= input.nextDouble();
        System.out.println("Enter the value of b");
        double b= input.nextDouble();
        System.out.println("Enter the value of c");
        double c= input.nextDouble();

        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.format("The area is: %.2f\n", area);
    }
}
