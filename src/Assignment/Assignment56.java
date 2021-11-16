package Assignment;

import java.util.Scanner;

public class Assignment56 {
    int result;
    int num1,num2;
    Scanner scanner = new Scanner(System.in);


    public double add(){
        System.out.println("Enter the number");
        num1=scanner.nextInt();
        System.out.println("Enter second number");
        num2= scanner.nextInt();

        result=(num1+num2);
        System.out.println("Addition is  "+result);
        return 0;
    }

    public double sub(){
        System.out.println("Enter the number");
        num1=scanner.nextInt();
        System.out.println("Enter second number");
        num2= scanner.nextInt();

        result=(num1-num2);
        System.out.println("Subtraction is  "+result);
        return 0;
    }


    public double multi(){
        System.out.println("Enter the number");
        num1=scanner.nextInt();
        System.out.println("Enter second number");
        num2= scanner.nextInt();

        result=(num1*num2);
        System.out.println("Multiplication is  "+result);
        return 0;
    }


    public double div(){
        System.out.println("Enter the number");
        num1=scanner.nextInt();
        System.out.println("Enter second number");
        num2= scanner.nextInt();

        result=(num1/num2);
        System.out.println("Division is  "+result);
        return 0;
    }


}


class ans{
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        Assignment56 obj = new Assignment56();
        System.out.println("******Choose Any Operation ******");
        System.out.println("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        i= scanner.nextInt();
        switch (i){
            case 1:
                obj.add();
                break;
            case 2:
                obj.sub();
                break;
            case 3:
                obj.multi();
                break;
            case 4:
                obj.div();
                break;
            default:
                System.out.println("Please choose correct number");
        }

    }
}
