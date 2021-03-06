package array;

import java.util.Scanner;

public class Array_Demo2 {

    public static void main(String[] args) {

        int[] arr= new int[3];
        Scanner input= new Scanner(System.in);

        for(int i=0; i< arr.length; i++)
        {
            System.out.println("Enter the element in array: ");
            arr[i]= input.nextInt();
        }

        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
