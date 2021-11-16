package Assignment;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        int s1,s2,s3,s4,s5,s6,t,a;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the marks of Marathi");
        s1=scanner.nextInt();
        System.out.println("Enter the marks of Hindi");
        s2=scanner.nextInt();
        System.out.println("Enter the marks of English");
        s3=scanner.nextInt();
        System.out.println("Enter the marks of Math");
        s4=scanner.nextInt();
        System.out.println("Enter the marks of Science");
        s5=scanner.nextInt();
        System.out.println("Enter the marks of SS");
        s6=scanner.nextInt();
        t=s1+s2+s3+s4+s5+s6;
        System.out.println("Total is "+t);
        a=t/6;
        System.out.println("Average is "+a);
    }

}
