package assignment_6;

import java.util.Scanner;

public class ThirtyFive {

    public static int greatest(int a, int b, int c){
        int greatest_value;

        if(a>=b && (b>c||b==c)){
            greatest_value=a;

        }else if(b>=a && (c>b||b==c)){
            greatest_value=c;
        }
        else if(b<=a && b<=c && a<=c ) {

            greatest_value= c;

        }else
        {
            greatest_value=b;
        }
        return greatest_value;
    }

    public static int second_greatest(int a, int b, int c){
        int second_great;

        if(a<=b){
            if(b<=c){
                second_great=b;
                return second_great;
            }
            else if(b>=c && c<=a){
                second_great=a;
                return second_great;
            }
            else if(b>=c && a<=c){
                second_great= c;
                return second_great;
            }
            else
            {
                return 0;
            }
        }
        else if(b<=a){
            if(a<=c){
                second_great= a;
                return second_great;
            }
            else if(a>=c && c<=b){
                second_great=b;
                return second_great;
            }
            else if(b>=c && a<=c){
                second_great= b;
                return second_great;
            }
            else{
                return 0;
            }

            }
        else{
            return 0;
        }

        }


    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int count, temp;
        int a=0; int b=0; int c=0; int d=0;
        System.out.print("Enter number of elements you want in the array: ");
        count = input.nextInt();

        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++)
        {
            num[i] = input.nextInt();
            c= greatest(a,b,num[i]);
            d= second_greatest(a,b,num[i]);
            a=c; b=d;
        }
        System.out.println("The second greatest value is: "+d);

    }
}
