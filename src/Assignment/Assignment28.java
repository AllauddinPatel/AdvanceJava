package Assignment;

import java.util.Scanner;

public class Assignment28 {
    public static void main(String[] args) {

        int a;
        int s1,s2,s3,s4,s5,s6,t;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the as of Marathi");
        s1=scanner.nextInt();
        System.out.println("Enter the as of Hindi");
        s2=scanner.nextInt();
        System.out.println("Enter the as of English");
        s3=scanner.nextInt();
        System.out.println("Enter the as of Math");
        s4=scanner.nextInt();
        System.out.println("Enter the as of Science");
        s5=scanner.nextInt();
        System.out.println("Enter the as of SS");
        s6=scanner.nextInt();
        t=s1+s2+s3+s4+s5+s6;
        System.out.println("Total is "+t);
        a=t/6;
        System.out.println("Average is "+a);



        if (a>=90){
            System.out.println("Grade A ");
        }
        else if (a>=80){
            System.out.println("Grade B ");
        }
        else if (a>=70){
            System.out.println("Garde C");
        }
        else if (a>=60){
            System.out.println("Grade D ");
        }
        else if (a>=40){
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }

    }

}
