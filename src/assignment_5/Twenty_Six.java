package assignment_5;

import java.util.Scanner;

public class Twenty_Six {

    public int Reverse_Number(int number) {

        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number = number / 10;
        }
        return reverse;
    }


        public static void main (String[]args){

            Scanner input = new Scanner(System.in);

            System.out.println("Enter the number you want to reverse: ");
            int number= input.nextInt();

            Twenty_Six ob= new Twenty_Six();
            System.out.println("The reverse number is: "+ob.Reverse_Number(number));


        }

}