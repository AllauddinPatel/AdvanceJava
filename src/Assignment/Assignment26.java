package Assignment;

import java.util.Scanner;

public class Assignment26 {
    //interger , char or special char
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Character");
        ch=scanner.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("It is Alphabet");
        }
        else  if (ch>='0' && ch<='9'){
            System.out.println("It is Number");
        }
        else {
            System.out.println("It is Special Character");
        }
    }
}
