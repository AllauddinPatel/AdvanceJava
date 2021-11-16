package Assignment;

import java.util.Scanner;

public class Assignment22 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Character");
        ch = scanner.next().charAt(0);
        System.out.println("Entered character is for checking is  "+ch);
        if (ch>='A'& ch<='Z'){
            System.out.println("Entered Character is Uppercase");
        }
        else {
            System.out.println("Entered Character is Lowercase");
        }
    }
}
