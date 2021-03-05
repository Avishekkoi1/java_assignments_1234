package assignment_6;

import java.util.Scanner;

public class Thirty_Four {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int counter, i=0, j=0, temp;
        int number[] = new int[100];

        System.out.print("How many elements you want to enter: ");
        counter = input.nextInt();


        for(i=0; i<counter; i++)
        {
            System.out.print("Enter Array Element"+(i+1)+": ");
            number[i] = input.nextInt();
        }


        j = i - 1;
        i = 0;
        input.close();
        while(i<j)
        {
            temp = number[i];
            number[i] = number[j];
            number[j] = temp;
            i++;
            j--;
        }

        System.out.print("Reversed array: ");
        for(i=0; i<counter; i++)
        {
            System.out.print(number[i]+ "  ");
        }

    }
}
