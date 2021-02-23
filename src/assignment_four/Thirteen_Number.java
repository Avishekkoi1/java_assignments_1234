package assignment_four;

import java.util.Scanner;

public class Thirteen_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double a= input.nextDouble();

        if(a<0)
        {
            System.out.format("The number is: %.2f\n", a);
        }
        else
        {
            System.out.println("Please input negative number");
        }
    }
}
