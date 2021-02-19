package practice;

import java.util.Scanner;

public class second_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a= input.nextDouble();
        System.out.println("Enter the second number: ");
        double b= input.nextDouble();

        double sum= (double) a+b;

        System.out.format("Sum of the first and second number is : %.2f\n", sum);
        System.out.println("Sum of "+a+" and "+b+" is :"+sum);

    }
}
