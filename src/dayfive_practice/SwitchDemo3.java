package dayfive_practice;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        String a= input.next();

        switch (a){
            case "add":
                System.out.println("This is addition");
                break;
            case "subtract":
                System.out.println("This is subtraction");
                break;
            case "multiply":
                System.out.println("This is multiplication");
                break;
            case "divide":
                System.out.println("This is division");
                break;
            default:
                System.out.println("Provide valid input");
                break;
        }
    }
}
