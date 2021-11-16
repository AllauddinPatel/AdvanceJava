package Assignment;

import java.util.Scanner;

public class Assignment8 {

    public static void main(String[] args) {
        int r;// Perimeter of circle 2pie*r
        float c,a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Radius of circle");
        r=scanner.nextInt();

        c= (float) (2*3.14*r);
        a=(float)(3.14*(r*r));
        System.out.println("Perimeter of Circle is "+c);
        System.out.println("Area Of Circle is "+a);


    }

}
