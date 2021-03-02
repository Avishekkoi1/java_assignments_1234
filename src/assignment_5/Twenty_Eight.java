package assignment_5;

import java.util.Scanner;

public class Twenty_Eight {

    public static void Is_Prime(int n){
        int i, m=0, flag=0;

        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }

    public static void Nth_Prime(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n to compute the nth prime number: ");

        int n = input.nextInt();
        int num=1, count=0, i;
        while (count < n)
        {
            num=num+1;
            for (i = 2; i <= num; i++)
            {

                if (num % i == 0)
                {

                    break;
                }
            }
            if (i == num)
            {

                count = count+1;
            }
        }

        System.out.println("The "+n+ " th prime number is: "+num);
    }

    public static void Prime_Numbers(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Starting Number : ");
        int start = input.nextInt();
        System.out.print("Enter Ending Number : ");
        int end = input.nextInt();
        System.out.println("Prime numbers between "+start+" and "+end+" are : ");
        int count;

        for(int i = start ; i <= end ; i++)
        {

            count = 0;
            for(int j = 1 ; j <= i ; j++)
            {
                if(i % j == 0)
                    count = count+1;
            }
            if(count == 2)
                System.out.println(i);
        }



    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to find if it is prime or not: ");
        int number= input.nextInt();

        Is_Prime(number);
        Nth_Prime();
        Prime_Numbers();

    }
}
