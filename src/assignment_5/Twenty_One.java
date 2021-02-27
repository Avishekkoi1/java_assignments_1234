package assignment_5;

import java.util.Scanner;

public class Twenty_One {

    public static String Equivalent(int number)
    {
        if(number==1){
            String equivalent= "Sunday";
            return equivalent;
        }
        else if(number==2){
            String equivalent= "Monday";
            return equivalent;
        }
        else if(number==3){
            String equivalent= "Tuesday";
            return equivalent;
        }
        else if(number==4){
            String equivalent= "Wednesday";
            return equivalent;
        }
        else if(number==5){
            String equivalent= "Thursday";
            return equivalent;
        }
        else if(number==6){
            String equivalent= "Friday";
            return equivalent;
        }
        else if(number==7){
            String equivalent= "Saturday";
            return equivalent;
        }
        else{
            String equivalent= "Please input valid number from 1-7.";
            return equivalent;
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int a= input.nextInt();

        String equivalent= Equivalent(a);

        System.out.println("The equivalent day is: "+equivalent);


    }
}
