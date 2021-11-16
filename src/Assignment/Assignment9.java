package Assignment;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {

        int l,w,a,p;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lenght of rectangle");
        l=scanner.nextInt();
        System.out.println("Width of Rectangle");
        w=scanner.nextInt();
        a=l*w;
        p=(2*l)+(2*w);
        System.out.println("Area Of Rectangle "+a);
        System.out.println("Perimeter Of Rectangle "+p);
    }
}
