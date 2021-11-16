package Assignment;

import java.util.Scanner;

public class Assignment55 {
    int height;
    int width;
    int depth,volume;

    Scanner scanner=new Scanner(System.in);
    public void cube(){
        System.out.println("Height");
        height=scanner.nextInt();
        System.out.println("Width");
        width=scanner.nextInt();
        System.out.println("Depth");
        depth=scanner.nextInt();
        volume=height*width*depth;
        System.out.println("Volume is "+volume);
    }

    public static void main(String[] args) {
        Assignment55 obj = new Assignment55();
        obj.cube();
    }

}
