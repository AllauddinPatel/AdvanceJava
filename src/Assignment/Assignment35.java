package Assignment;

import java.util.Scanner;

public class Assignment35 {
    //factorial
    public static void main(String[] args) {
        int num,fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        num=scanner.nextInt();
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
