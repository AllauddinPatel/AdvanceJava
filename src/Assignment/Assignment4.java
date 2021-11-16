package Assignment;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        //Program For Swap Two Variable
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A value");
        a=scanner.nextInt();
        System.out.println("Enter B Value");
        b=scanner.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Value of A "+a);
        System.out.println("value of B "+b);

    }
}
