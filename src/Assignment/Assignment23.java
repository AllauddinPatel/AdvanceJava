package Assignment;

import java.util.Scanner;

public class Assignment23 {
//    Equilateral triangle: All three sides are equal.
//    Isosceles triangle: All two sides are equal.
//    Scalene triangle: No sides are equal.
    public static void main(String[] args) {
        int side1,side2,side3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the the three side if Triangle");
        side1= scanner.nextInt();
        side2= scanner.nextInt();
        side3= scanner.nextInt();
        if (side1==side2 && side1==side3 && side2==side3){
            System.out.println("Triangle is Equilateral");
        }
        else if (side1==side2 ||side1==side3){
            System.out.println("Triangle is Isosceles");
        }
        else {
            System.out.println("Triangle is Scalene");
        }
    }
}
