package assignment_3;

import java.util.Scanner;

public class Tenc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a= input.nextDouble();
        System.out.println("Enter the value of b");
        double b= input.nextDouble();
        System.out.println("Enter the value of c");
        double c= input.nextDouble();

        double y= Math.sqrt((b*b)-(4*a*c));
        double x=((y-b)/(2*a));

        System.out.format("The value of x is: %.2f\n", x);
    }
}
