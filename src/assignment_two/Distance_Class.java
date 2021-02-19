package assignment_two;

import java.util.Scanner;

public class Distance_Class {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the initial velocity: ");
        double u= input.nextDouble();
        System.out.println("Enter the time passed: ");
        double t= input.nextDouble();
        System.out.println("Enter the acceleration: ");
        double a= input.nextDouble();

        double s= (double) ((u*t)+0.5*(a*t*t));
        System.out.format("The distance covered in "+t+" unit is: %.2f\n", s);
    }
}
