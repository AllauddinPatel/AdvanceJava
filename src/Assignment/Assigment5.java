package Assignment;

import java.util.Scanner;

public class Assigment5 {
    public static void main(String[] args) {
        int d,y,w,d1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the days for conversion");
        d=scanner.nextInt();
        y=d/365;
        w=(d%365)/7;
        d1=(d%365)%7;
        System.out.println("Year "+y+" Weeks "+w+" Days "+d1 );


    }
}
