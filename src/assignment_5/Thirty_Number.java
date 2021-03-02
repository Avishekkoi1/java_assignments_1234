package assignment_5;

import java.util.Scanner;

public class Thirty_Number {

    public static int summation(int a, int b){

        int c= a+b;
        return c;

    }

    public static void display(int c){

        System.out.print(+c+" ");

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for number of fibonacci series : ");
        int n = input.nextInt();
        int running_sum1 =1;
        int running_sum2=1;
        int running_temp=0;

        for (int i=1; i<=n; i++){

            if(i==1 || i==2){
                display(running_sum2);
            }
            else {

                running_temp= running_sum2;
                running_sum2 = summation(running_sum1, running_sum2);
                running_sum1= running_temp;

                display(running_sum2);
            }

        }

    }
}
