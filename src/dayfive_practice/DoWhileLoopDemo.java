package dayfive_practice;

import java.util.Scanner;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=5;

        do {
            System.out.println(a);
            a++;
        } while(a<7);
        System.out.println("The End");

    }
}
