package dayfive_practice;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        char a= input.next().charAt(0);

        switch (a){
            case '+':
                System.out.println("This is addition");
                break;
            case '-':
                System.out.println("This is subtraction");
                break;
            case '*':
                System.out.println("This is multiplication");
                break;
            case '/':
                System.out.println("This is division");
                break;
            default:
                System.out.println("Provide valid input");
        }
    }
}
