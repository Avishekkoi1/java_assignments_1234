package assignment_6;

import java.util.Scanner;

public class ThirtySeven {
    public Object value_of_matrix1(){

        final int ROWS=3;
        final int COLUMNS=3;

        int[][] arr1= new int[ROWS][COLUMNS];
        Scanner input= new Scanner(System.in);

        for (int i=0; i<ROWS; i++){

            for(int j=0; j<COLUMNS; j++){
                System.out.println("Enter: ");
                arr1[i][j]= input.nextInt();
            }
        }
        return arr1;
    }

    public Object value_of_matrix2(){
        final int ROWS=3;
        final int COLUMNS=3;

        int[][] arr2= new int[ROWS][COLUMNS];
        Scanner input= new Scanner(System.in);

        for (int i=0; i<ROWS; i++){

            for(int j=0; j<COLUMNS; j++){
                System.out.println("Enter: ");
                arr2[i][j]= input.nextInt();
            }
        }
        return arr2;
    }


    public static void main(String[] args) {

        final int ROWS=3;
        final int COLUMNS=3;

        ThirtySeven ob1= new ThirtySeven();
        int [][]arr1= (int[][])ob1. value_of_matrix1();

        ThirtySeven ob2= new ThirtySeven();
        int [][]arr2= (int[][])ob1. value_of_matrix2();

        int[][] arr3= new int[3][3];

        for (int i=0; i<3; i++){

            for(int j=0; j<3; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("+");

        for (int i=0; i<3; i++){

            for(int j=0; j<3; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" = ");

        for (int i=0; i<ROWS; i++){

            for(int j=0; j<COLUMNS; j++){

                arr3[i][j]= arr1[i][j]+arr2[i][j];
            }
        }
        for (int i=0; i<3; i++){

            for(int j=0; j<3; j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
