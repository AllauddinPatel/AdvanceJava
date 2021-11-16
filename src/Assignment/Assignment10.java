package Assignment;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        int a,s;//s= side of triangle;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Side od triangle");
        s=scanner.nextInt();
        a= (int) ((1.73*s*s)/4);
        System.out.println("Area Of Equilateral Triangle is "+a);
    }
}
