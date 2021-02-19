package assignment_one;

import java.util.Scanner;

public class fourth_assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle: ");
        double P= input.nextDouble();
        System.out.println("Enter the time: ");
        double T= input.nextDouble();
        System.out.println("Enter the interest rate ");
        double R= input.nextDouble();

        double Interest= (double) (P*T*R)/100;
        System.out.format("The interest amount is: %.2f", Interest);
    }
}
