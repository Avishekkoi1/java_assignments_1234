package assignment_four;

import java.util.Scanner;

public class Fourteen_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a= input.nextInt();

        System.out.println("Enter the second number: ");
        int b= input.nextInt();

        if(a==b)
        {
            System.out.println("The first and the second number are equal");
        }
        else if(a<b)
        {
            System.out.println(""+a+" is lesser than "+b+" " );
        }
        else
        {
            System.out.println(""+a+" is greater than "+b+" ");
        }

    }
}
