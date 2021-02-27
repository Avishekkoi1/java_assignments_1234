package assignment_5;

import java.util.Scanner;

public class Twenty_Five {






    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int number_of_students= input.nextInt();



        for(int i=1; i<=number_of_students; i++){

            System.out.println("Enter the names of student: ");
            String name= input.next();

            System.out.println("Enter the score of student: ");
            double score= input.nextDouble();

        }

    }
}
