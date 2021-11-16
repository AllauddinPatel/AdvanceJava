package Assignment;

import java.util.Scanner;

public class Assignment13 {
    //Different type of input through scanner
    public static void main(String[] args) {
        int i;
        char c;
        String str;
        float f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert integer value");
        i= scanner.nextInt();
        System.out.println("insert char value");
        c= scanner.next().charAt(0);
        System.out.println("insert string value");
        str= scanner.next();
        System.out.println("insert float value");
        f= scanner.nextFloat();

        System.out.println("value of integer is "+i);
        System.out.println("value of char is "+c);
        System.out.println("value of String is "+str);
        System.out.println("value of float is "+f);

    }
}
