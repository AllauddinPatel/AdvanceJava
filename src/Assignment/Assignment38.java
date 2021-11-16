package Assignment;

import java.util.Scanner;


public class Assignment38 {
    //even odd in a range
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number from range");
        num1= scanner.nextInt();
        System.out.println("Enter the last number from range");
        num2= scanner.nextInt();

        System.out.println("The even number from range "+num1+ " to "+num2);
        for (int i = num1;i<=num2;i++){
            if (i%2==0){
                System.out.println(i);
            }
          }
        System.out.println("The odd number from range "+num1+ " to "+num2);

        for (int j=num1;j<=num2;j++){
            if (j%2!=0){
                System.out.println(j);
            }
        }
    }
}
