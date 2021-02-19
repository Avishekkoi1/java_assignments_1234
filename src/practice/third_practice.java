package practice;

import javax.swing.*;

public class third_practice {
    public static void main(String[] args) {
        int a= Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
        int b= Integer.parseInt(JOptionPane.showInputDialog("Enter b: "));

        int sum=a+b;
        System.out.println("sum of "+a+" and "+b+" is :" +sum);
        JOptionPane.showMessageDialog(null, "sum of a and b is: "+sum);
    }
}
