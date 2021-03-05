package assignment_6;

import java.util.Scanner;

public class ThirtyThree {

    public static void ascending_order(){

        Scanner input= new Scanner(System.in);

        int count, temp;

        //User inputs the array size

        System.out.print("Enter number of elements you want in the array: ");
        count = input.nextInt();

        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++)
        {
            num[i] = input.nextInt();
        }
        input.close();
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++) {
                if (num[i] > num[j])
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++)
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);

    }

    public static void main(String[] args) {

        ascending_order();

    }

}
