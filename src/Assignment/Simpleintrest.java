package Assignment;

import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
        float p,r,t;  //p=price r=rate t=time
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Price");
        p=scanner.nextFloat();
        System.out.println("Enter the Rate Of Interest");
        r=scanner.nextFloat();
        System.out.println("Enter the time");
        t= scanner.nextFloat();
        float si=(p*r*t)/100;   //simple interest formula
        System.out.println("interest on your price is" +si);

    }
}
