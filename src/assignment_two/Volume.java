package assignment_two;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        double PI= 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a cylinder: ");
        double r= input.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double h= input.nextDouble();

        double Volume= (double) (PI*r*r*h);
        System.out.format("The volume of the cylinder is: %.2f\n", Volume);
    }
}
