package controlflowstatement;

import java.util.Scanner;

public class adddowhile {
    public static void main(String[] args) {
        char choice;
        int sum = 0,num;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the Value");
            num=scanner.nextInt();
            sum=num+sum;

            System.out.println("Do You Want to Continue");
            choice=scanner.next().charAt(0);

        }while (choice =='Y'||choice=='y');
        System.out.println(sum);





    }
}
