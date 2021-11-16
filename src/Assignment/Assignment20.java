package Assignment;

import java.util.Scanner;

public class Assignment20 {
    public static void main(String[] args) {
        int min,max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Two Number");
        min=scanner.nextInt();
        max=scanner.nextInt();
        if(max>min){
            System.out.println("Maximum number is "+max);
        }
        else {
            System.out.println("Maximum Number is "+min);
        }
    }
}
