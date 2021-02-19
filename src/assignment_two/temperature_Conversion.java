package assignment_two;

import java.util.Scanner;

public class temperature_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in a Fahrenheit: ");
        double f= input.nextDouble();
        System.out.println("Enter the temperature in a Celsius: ");
        double c= input.nextDouble();

        double f_c= (double) ((f-32)*5/9);
        double c_f= (double) ((c*9/5)+32);
        System.out.format("The Celsius value of "+f+" is: %.2f\n", f_c);
        System.out.format("The Fahrenheit value of "+c+" is: %.2f\n", c_f);
    }
}
