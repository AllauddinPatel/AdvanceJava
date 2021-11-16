package Assignment;

import java.util.Scanner;

public class Assignment27 {
    //leap year or not
    public static void main(String[] args) {
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any year");
        year=scanner.nextInt();
        if (year%4==0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}
