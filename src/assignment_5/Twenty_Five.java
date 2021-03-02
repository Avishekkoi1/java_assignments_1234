package assignment_5;

import java.util.Scanner;

public class Twenty_Five {

    public static String greatest_scorer(String name_1, double score_1, String name_2, double score_2){

        if (score_1<=score_2){
            String scorer= name_2;
            return scorer;

        }else
        {
            String scorer= name_1;
            return scorer;
        }

    }
    public static double greatest_score(double score_1, double score_2 ) {

        if (score_1 <= score_2) {
            double great_score = score_2;
            return great_score;
        } else {
            double great_score = score_1;
            return great_score;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double score_2=0;
        String name_2= "";

        System.out.println("Enter the number of students: ");
        int number_of_students= input.nextInt();



        for(int i=1; i<=number_of_students; i++){

            System.out.println("Enter the names of student: ");
            String name_1= input.next();

            System.out.println("Enter the score of student: ");
            double score_1= input.nextDouble();

            name_2= greatest_scorer(name_1, score_1, name_2, score_2);
            score_2= greatest_score(score_1, score_2);
        }
        System.out.println("The greatest scorer is "+name_2+" with a total of " +score_2);

    }
}
