package Assignment;

import java.util.Scanner;

public class Assignment24 {
    //loss profit program
    public static void main(String[] args) {
        double cp,sp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter th cost Price");
         cp= scanner.nextDouble();
        System.out.println("Enter the Selling price");
         sp= scanner.nextDouble();

        if (cp-sp>0){
            System.out.println("You are in loss with"+(cp-sp) );
        }
        else if (sp-cp<0){
            System.out.println("You are in Profit with "+(sp-cp));
        }
        else {
            System.out.println("Neutral");
        }
    }
}
