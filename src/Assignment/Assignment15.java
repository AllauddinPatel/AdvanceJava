package Assignment;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {

        int s,h,d,t,h1,d1,t1,h2,d2,t2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Salary");
        s=scanner.nextInt();
        if (s<=10000) {
            h = (int) (s * 0.2);
            d = (int) (s * 0.8);
            t = s + h + d;
            System.out.println("Total Gross Salary is " + t);
        }
            else if(s>10000&&s<=20000){
                h1= (int) (s*0.25);
                d1 = (int) (s*0.9);
                t1=s+h1+d1;
            System.out.println("Gross Salary is "+t1);
            }
            else if (s>20000){
                h2= (int) (s*0.3);
                d2  = (int) (s*0.95);
                t2  = s+h2+d2;
            System.out.println("Gross Salary is "+t2);
        }
            else {
            System.out.println("Invalid Ammount");
        }

    }
}
