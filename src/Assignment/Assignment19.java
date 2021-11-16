package Assignment;

import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
      int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number ");
        num= scanner.nextInt();
        if (num<0){
            System.out.println("Number is Negative");
        }
        else if(num==0){
            System.out.println("Number is Zero");
        }
        else {
            System.out.println("Number Is Positive");
        }
    }
}
