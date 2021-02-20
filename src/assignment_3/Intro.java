package assignment_3;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your roll no.: ");
        int a= input.nextInt();
        System.out.println("Enter your name: ");
        String b= input.next();
        System.out.println("Enter your nationality: ");
        String c= input.next();

        System.out.println("Roll: " + a);
        System.out.println("Name: " + b);
        System.out.println("Nationality: " + c);
    }
}
