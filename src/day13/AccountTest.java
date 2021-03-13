package day13;

import java.util.Scanner;

//an example of run time polymorphism(dynamic binding)
//which can be achieved by overriding of methods
public class AccountTest {

    public static void main(String[] args) {

        Account account=null;
        System.out.println("Enter choice: ");
        String choice= new Scanner(System.in).next();

        switch(choice){
            case "saving":
                account= new SavingAccount();
                break;
            case "current":
                account= new CurrentAccount();
            default:
                System.out.println("Wrong choice");
        }

        if(account!=null){
            account.openAccount();
        }
    }
}
