package Assignment;

import java.util.Scanner;

public class Assignment21 {
    public static void main(String[] args) {
        char input;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Alphabet ");
        input = scanner.next().charAt(0);
        System.out.println("Input variable is "+input);
        if (input == 'a'||input=='A'){
            System.out.println("Input Alphabet is vowel");
        }

        else if (input == 'e'|| input=='E'){
            System.out.println("Input Alphabet is vowel");
        }
        else if (input == 'i'|| input=='I'){
            System.out.println("Input Alphabet is vowel");
        }
        else if (input == 'o'||input=='O'){
            System.out.println("Input Alphabet is vowel");
        }
        else if (input == 'u'||input=='U'){
            System.out.println("Input Alphabet is vowel");
        }

        else {
            System.out.println("It is Consonant");
        }
    }
}
