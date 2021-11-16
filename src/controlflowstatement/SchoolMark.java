package controlflowstatement;

import java.util.Scanner;

public class SchoolMark {
    public static void main(String[] args) {
        String name;
        int mark;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        name=scanner.next();
        System.out.println("Enter Your Marks");
        mark= scanner.nextInt();

        if (mark>=75){
            System.out.println(name+" You Got Destination with "+mark);
        }
        else if (mark>=60){
            System.out.println(name+" You Got First Class with "+mark);
        }
        else if (mark>=45){
            System.out.println(name+" You Got Low Class with "+mark);
        }
        else if (mark>=35){
            System.out.println(name+" You Got Pass with "+mark);
        }
        else {
            System.out.println("Fail");
        }

    }

}
