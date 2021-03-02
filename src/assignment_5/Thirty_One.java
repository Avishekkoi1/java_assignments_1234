package assignment_5;

import java.util.Scanner;

public class Thirty_One {

    public static int new_number(int a, int b){

        a=a*10+b;
        return a;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of patterns you want to see : ");
        int n = input.nextInt();
        int a=0;
        int b=1;

        for(int i=1; i<=n; i++){

            a= new_number(a,b);
            b++;
            System.out.println(a);
        }

    }
}
