package Assignment;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        //week using switch case
      int i;
        Scanner scanner=new Scanner(System.in);
             System.out.println("Enter the Day");
             i=scanner.nextInt();
             switch (i){
                 case 1:
                     System.out.println("This is Monday");
                     break;
                 case 2:
                     System.out.println("Tuesday");
                     break;
                 case 3:
                     System.out.println("Wednesday");
                     break;
                 case 4:
                     System.out.println("Thursday");
                     break;
                 case 5:
                     System.out.println("Friday");
                     break;
                 case 6:
                     System.out.println("Saturday");
                     break;
                 case 7:
                     System.out.println("Sunday");
                     break;
                 default:
                     System.out.println("Out of Day");
             }




    }
}
