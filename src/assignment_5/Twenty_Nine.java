package assignment_5;

import java.util.Scanner;

public class Twenty_Nine {

    public static double factorial(double n){
        int fact=1;
        for(int i=1; i<=n; i++){

            fact= fact*i;
        }
        return fact;
    }

    public static double summation(double a, double b){

        double c= a+b;
        return c;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        double n = input.nextDouble();
        double running_sum=0;
        double individual_number=0;
        for(double i=1; i<=n; i++){

            individual_number= i/factorial(i);
            running_sum= summation(running_sum, individual_number);

        }

        System.out.format("The summation is: %.3f\n", running_sum);
    }

}
