package Assignment;

import java.util.Scanner;

public class Assignment39 {
    //palindrome
    public static void main(String[] args) {
        int num,reverse=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        num= scanner.nextInt();
        int temp = num;
        while (num>0){
            int remainder=num%10;
            reverse=(reverse*10)+remainder;
            num=num/10;

        }
        if (temp==reverse){
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("Not an palindrome");
        }
    }
}
