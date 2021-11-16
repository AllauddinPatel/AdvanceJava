package Assignment;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        int num, num2,num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("First No");
        num = scanner.nextInt();
        System.out.println("Second No");
        num2=scanner.nextInt();
        num3=num/num2;
        System.out.println("Division is"+num3);

    }
}