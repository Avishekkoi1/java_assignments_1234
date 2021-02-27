package assignment_5;

import java.util.Scanner;

public class Twenty_Four {

    public static int multiplication(int a, int b){

        int running_factorial= a*b;
        return running_factorial;
    }

    public static void display(int factorial){
        System.out.println("The factorial is: "+factorial);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Enter the integer to find factorial of: ");
            int number= input.nextInt();
            int running_factorial=1;

            for(int i=1; i<=number; i++){

                running_factorial= multiplication(running_factorial, i);
            }
            display(running_factorial);

        }



    }
}

