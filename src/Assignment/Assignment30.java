package Assignment;

import java.util.Scanner;

public class Assignment30 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        num = scanner.nextInt();
        System.out.println("The power of number is  "+(num<<num));
    }
}
