package assignment_5;

import java.util.Scanner;

public class Twenty_Seven {

    public int summation(int a, int b) {

        int running_sum = a + b;
        return running_sum;
    }

    public int multiplication(int a, int b) {
        int running_multiplication = a * b;
        return running_multiplication;
    }

    public int Individual_Number(int number) {

        int individual_number = (number % 10);
        return individual_number;
    }

    public int number(int number) {

        number = number / 10;
        return number;
    }


    public static void main(String[] args) {

        int running_sum = 0;
        int running_multiplication = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want to get multiplication and summation of: ");
        int remaining_number = input.nextInt();

        Twenty_Seven ob1 = new Twenty_Seven();
        Twenty_Seven ob2 = new Twenty_Seven();
        Twenty_Seven ob3 = new Twenty_Seven();
        Twenty_Seven ob4 = new Twenty_Seven();

        while (remaining_number != 0) {

            int individual_number = ob1.Individual_Number(remaining_number);
            remaining_number = ob2.number(remaining_number);

            running_sum = ob3.summation(running_sum, individual_number);
            running_multiplication = ob4.multiplication(running_multiplication, individual_number);
        }
        System.out.println("The summation is: "+running_sum);
        System.out.println("The multiplication is: "+running_multiplication);
    }
}
