package lab;

import day13.SavingAccount;

import java.util.Scanner;

public class lab1 {

    private static String Account_Number;
    private double balance;

    public void open_account(String account_name, double initial_balance, String acc_num ){

        System.out.println("Name of account: "+account_name);
        System.out.format("Balance on the account: %.2f\n", initial_balance );
        System.out.println("Account number: "+acc_num);
    }
    public void open_account(String account_name){

        System.out.println("Name of account: "+account_name);
        System.out.println("Balance on the account: "+0);

    }
    public lab1(String account_Number, double initial_balance ){

        Account_Number= account_Number;
        balance= initial_balance;

    }

    public String getAccount_Number() {
        return Account_Number;
    }

    public static void setAccount_Number(String account_Number) {
        Account_Number = account_Number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){

        balance= balance- amount;
    }

    public void withdraw(double fee, double a){

        balance= balance-fee;

    }
    public void deposit(double amount){

        balance= balance+amount;
    }
    public void deposit(double amount, double interest_rate){
        balance= balance+amount+(interest_rate*amount);
    }







    public static void main(String[] args) {

        double balance;
        String account_name;
        String account_number;

        System.out.println("Account holder's name: ");
        account_name= new Scanner(System.in).next();

        System.out.println("Initial balance for the account");
        double initial_balance= new Scanner(System.in).nextInt();

        System.out.println("Put account number: ");
        account_number= new Scanner(System.in).next();

        lab1 account1= new lab1(account_number, initial_balance);
        lab1 account2= new lab1("777898989",200);
        account1.open_account(account_name, initial_balance, account_number);
        System.out.println("");
        account2.open_account("Shyam", 200, "777");
        System.out.println("");

        account1.deposit(500);
        balance=account1.getBalance();
        //account_number= account1.getAccount_Number();
        account1.open_account(account_name,balance, account_number );
        System.out.println("");

        account1.deposit(500, 0.08);
        balance=account1.getBalance();
        //account_number= account1.getAccount_Number();
        account1.open_account(account_name,balance, account_number );
        System.out.println("");

        account1.withdraw(500);
        account1.withdraw(5, 1);
        //account_number= account2.getAccount_Number();
        balance=account1.getBalance();
        account1.open_account(account_name,balance, account_number );
        System.out.println("");


        account2.deposit(800,0.07);
        balance= account2.getBalance();
        //account_number= account2.getAccount_Number();
        account2.open_account("Shyam", balance, "777");
        System.out.println("");


        account2.withdraw(500);
        account2.withdraw(5, 1);
        //account_number= account2.getAccount_Number();
        balance=account2.getBalance();
        account2.open_account("Shyam",balance, "777" );















    }


}
