package assignment_5;

import java.util.Scanner;

public class Twenty_Two {

    public static int multiplication(int a, int b){

        int c= a*b;
        return c;
    }

    public static void display(int a, int b, int c){
        System.out.println(+a+ "x" +b+ "=" +c);
    }

    public static void main(String[] args) {

        while(true){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter an integer: ");
            int number= input.nextInt();

            for(int i=0; i<=10; i++){

                int c= multiplication(number, i);
                display(number, i, c);

            }
        }

    }
}
