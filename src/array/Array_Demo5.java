package array;

import java.util.Scanner;

public class Array_Demo5 {



    public static void main(String[] args) {

        final int ROWS=3;
        final int COLUMNS=3;

        int[][] arr= new int[ROWS][COLUMNS];
        Scanner input= new Scanner(System.in);

        for (int i=0; i<ROWS; i++){

            for(int j=0; j<COLUMNS; j++){
                System.out.println("Enter: ");
                arr[i][j]= input.nextInt();
            }
        }

        for (int i=0; i<ROWS; i++){

            for(int j=0; j<COLUMNS; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
