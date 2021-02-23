package assignment_four;

import java.util.Scanner;

public class Sixteen_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a= input.nextInt();

        if(a%2==0)
        {
            System.out.println(+a + " is an even number ");
        }
        else
        {
            System.out.println(+a+" is an odd number");
        }
    }
}
