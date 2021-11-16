package Assignment;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        int unit;
        int gross;
        int surcharge;
        double firstfifty=50*0.5;
        double abovefifty=100*0.75;
        double above150=100*1.20;
        double above250=100*1.5;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the units ");
        unit= scanner.nextInt();
        if (unit<=50){
            gross=(int) (unit*0.5);
            surcharge=(int )(gross*0.2);
            System.out.println("Final Bill is "+surcharge);
        }
        else if (unit>50 & unit<150){
            gross=(int)(firstfifty+((unit-50)*0.75));
            surcharge=(int )(gross*0.2);
            System.out.println("Final Bill is "+surcharge);

        }
        else if (unit>150 & unit<250){
            gross=(int)(firstfifty+abovefifty+((unit-150)*1.2));
            surcharge=(int )(gross*0.2);
            System.out.println("Final Bill is "+surcharge);
        }
        else if  (unit>250);
        gross=(int)(firstfifty+abovefifty+above150+((unit-250)*1.5));
        surcharge=(int )(gross*0.2);
        System.out.println("Final Bill is "+surcharge);


    }
}
