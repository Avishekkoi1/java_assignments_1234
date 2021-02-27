package assignment_5;

import java.util.Scanner;

public class Twenty_Number {

    public static int addition(int a, int b){
        int value= a+b;
        return value;
    }
    public static int subtraction(int a, int b){
        int value= a-b;
        return value;
    }
    public static int multiplication(int a, int b){
        int value= a*b;
        return value;
    }
    public static int division(int a, int b){
        int value= a/b;
        return value;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int a= input.nextInt();
        System.out.println("Enter the second integer: ");
        int b= input.nextInt();

        System.out.println("Enter the operator");
        String operator= input.next();

        switch (operator){
            case "+":
                int c= addition(a, b);
                System.out.println(+c);
                break;
            case "-":
                c= subtraction(a, b);
                System.out.println(+c);
                break;
            case "*":
                c= multiplication(a, b);
                System.out.println(+c);
                break;
            case "/":
                c= division(a, b);
                System.out.println(+c);
                break;
            default:
                System.out.println("Enter valid operator");
                break;

        }

    }
}
