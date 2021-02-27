package assignment_5;

import java.util.Scanner;

public class Twenty_Three {

    public static int addition(int a, int b){

        int running_sum= a+b;
        return running_sum;
    }

    public static void display(int total_sum){
        System.out.println("The sum of 1 to nth number is: "+total_sum);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Enter the integer to find sum from 1 to that number: ");
            int number= input.nextInt();
            int running_sum=0;

            for(int i=0; i<=number; i++){

                running_sum= addition(running_sum, i);
            }
            display(running_sum);

        }



    }
}
