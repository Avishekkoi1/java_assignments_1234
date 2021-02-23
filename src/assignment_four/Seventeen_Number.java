package assignment_four;

import java.util.Scanner;

public class Seventeen_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a date in AD: ");
        int a= input.nextInt();

        if(((a % 4 == 0) && (a % 100!= 0)) || (a%400 == 0))
        {
            System.out.println(+a+ " is a leap year.");
        }
        else
        {
            System.out.println(+a+ " is not a leap year");
        }
    }

}
