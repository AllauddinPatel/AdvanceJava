package Assignment;

import java.util.Scanner;

public class Assignment33 {
    //table of number
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        n= scanner.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
