package controlflowstatement;

import java.util.Scanner;

public class numguess {
    public static void main(String[] args) {
        int a,b=(int)(Math.random()*100)+1,counter=0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the value");
            a= scanner.nextInt();
            if (a<b){
                System.out.println("number is less");
            }
            else if (a>b){
                System.out.println("Number is greater");
            }
            else {
                System.out.println("Number Similar" +counter+ "Attempt");
            }

        }while  (a!=b);
    }
}
