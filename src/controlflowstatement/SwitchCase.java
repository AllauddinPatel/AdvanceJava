package controlflowstatement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        i=scanner.nextInt();

        //Switch Case
        switch (i){
            case 1:
                //Nested Switch
                int j;
                System.out.println("Enter the Number");
                j=scanner.nextInt();
                switch (j){
                    case 10:
                        System.out.println(10);
                        break;
                    case 20:
                        System.out.println(20);
                        break;
                    default:
                        System.out.println("Default");
                }
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Default");
        }


    }

}
