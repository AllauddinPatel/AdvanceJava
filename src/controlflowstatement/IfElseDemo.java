package controlflowstatement;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        int age;
        String Nationality;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age");
        age= scanner.nextInt();
        System.out.println("Enter Nationality");
        Nationality = scanner.next();

        if (age>=18) {//Single IF
            if (Nationality.equals("Indian")) {
                System.out.println("You can vote");
            } else {
                System.out.println("Not indian");
            }
        }else {
            System.out.println("Can not vote");
        }

        int a=10,b=20,c=30,d=40;

        if(a>b && a>c && a>d){                    //Ladder If Else
            System.out.println("a is greater");
        }
        else if (b>c && b>d){
            System.out.println("b is greater");
        }
        else if(c>d){
            System.out.println("c is Greater");
        }
        else {
            System.out.println("D is Greater");
        }
    }
}
