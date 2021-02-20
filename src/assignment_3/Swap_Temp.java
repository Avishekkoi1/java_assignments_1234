package assignment_3;

import java.util.Scanner;

public class Swap_Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a= input.nextDouble();
        System.out.println("Enter the value of b: ");
        double b= input.nextDouble();
        double c=a;
        double d=b;
        a=d;
        b=c;

        System.out.format("The value of a is: %.2f\n", a);
        System.out.format("The value of b is: %.2f\n", b);
    }
}
