package Assignment;

import java.util.Scanner;

public class Assignment11 {
    //Celsius into Fahrenheit and vice versa
    public static void main(String[] args) {

        float c,f,a,b;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value in Celsius");
        c=scanner.nextFloat();
        a=(float) (c*1.8)+32;
        System.out.println("Conversion of Celsius into Fahrenheit is "+a);
        System.out.println("Enter the value in Fahrenheit");
        f=scanner.nextFloat();
        b= (float) 5/9*(f-32);
        System.out.println("Conversion of Fahrenheit into Celsius is "+b);


    }
}
