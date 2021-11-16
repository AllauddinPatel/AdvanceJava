package Assignment;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three numbers ");
        a= scanner.nextInt();;
        b= scanner.nextInt();
        c= scanner.nextInt();
        if(a>b&&a>c){
            System.out.println("Maximum Number is "+a);
        }
        else if (b>c){
            System.out.println("Maximum Number is "+b);
        }
        else {
            System.out.println("Maximum Number is "+c);
        }
    }
}
