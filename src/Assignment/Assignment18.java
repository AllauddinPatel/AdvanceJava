package Assignment;

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number for even odd check ");
        num=scanner.nextInt();
        if(num%2==0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
