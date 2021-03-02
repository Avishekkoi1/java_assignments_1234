package assignment_5;

import java.util.Scanner;

public class Thirty_Number {

    public static int summation(int a, int b){

        int c= a+b;
        return c;

    }

    public static void display(int c){

        System.out.println(c);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n = input.nextInt();
        int running_sum1 =0;
        int running_sum2=1;

        for (int i=0; i<=n; i++){

            running_sum2= summation(running_sum1, running_sum2);
            display(running_sum2);

        }

    }
}
