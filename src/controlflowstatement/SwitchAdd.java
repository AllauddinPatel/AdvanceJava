package controlflowstatement;

import java.util.Scanner;

public class SwitchAdd {
    public static void main(String[] args) {
        int num,a,b;
        char operation;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Operation");
        operation=scanner.next().charAt(0);
        System.out.println("Enter First Number");
        a=scanner.nextInt();
        System.out.println("Enter Second Number");
        b=scanner.nextInt();
        switch (operation){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                 break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("enter correct operation");

        }

    }
}
