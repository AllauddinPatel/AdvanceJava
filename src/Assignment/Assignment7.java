package Assignment;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        int num, num2,num3,num4,num5,num6,num7;
        Scanner scanner = new Scanner(System.in);
        System.out.println("First No");
        num = scanner.nextInt();
        System.out.println("Second No");
        num2=scanner.nextInt();

        num3=num+num2;
        num4=num-num2;
        num5=num*num2;
        num6=num/num2;
        num7=num%num2;

        System.out.println("Addition is "+num3);
        System.out.println("Subtraction is "+num4);
        System.out.println("Multi is "+num5);
        System.out.println("Div is "+num6);
        System.out.println("Reminder is "+num7);

    }
}
