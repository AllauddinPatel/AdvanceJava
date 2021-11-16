package controlflowstatement;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number to Check Prime Number");
        num=scanner.nextInt();
        if (num % num == 0){
            System.out.println(+num+"is Prime Number");
        }
        else {
            System.out.println("Try Another");
        }
    }
}
