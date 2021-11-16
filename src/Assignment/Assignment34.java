package Assignment;

import java.util.Scanner;

public class Assignment34 {
    // prime number
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number ");
        num= scanner.nextInt();
        if (num%num==0){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }
    }
}
