package assignment_four;

import java.util.Scanner;

public class Fifteen_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code: ");
        int a= input.nextInt();

        if(a>=0 && a<=128)
        {
            char c= (char) a;
            System.out.println("The ASCII value for the number is: "+c);
        }
        else
        {
            System.out.println("Please enter number between 0 and 128");
        }
    }
}
