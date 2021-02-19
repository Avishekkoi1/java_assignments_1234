package assignment_two;

import java.util.Scanner;

public class Weight_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight in pounds: ");
        double pound= input.nextDouble();
        double kg= (double) (0.454*pound);
        System.out.format(""+pound+" pounds in kilograms is: %.3f\n", kg);
    }
}
