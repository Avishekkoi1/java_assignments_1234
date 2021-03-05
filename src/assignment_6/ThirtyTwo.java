package assignment_6;

import java.util.Scanner;



public class ThirtyTwo {

    public static void sum(){
        int[] array = new int[5];
        int sum = 0;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the elements:");

        for (int i=0; i<5; i++)
        {
            array[i] = input.nextInt();
        }
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);

    }

    public static void main(String[] args) {

        sum();


    }


}
