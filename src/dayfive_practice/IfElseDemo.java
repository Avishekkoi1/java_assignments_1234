package dayfive_practice;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a= input.nextInt();

        switch (a){
            case 1:
                System.out.println("This is addition");
                break;
            case 2:
                System.out.println("This is subtraction");
                break;
            case 3:
                System.out.println("This is multiplication");
                break;
            case 4:
                System.out.println("This is division");
                break;
            default:
                System.out.println("Provide valid input");
        }



    }
}
