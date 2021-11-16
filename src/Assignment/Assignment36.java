package Assignment;

import java.util.Scanner;

public class Assignment36 {
    public static void main(String[] args) {
        int num,count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digit");
        num= scanner.nextInt();
        while (num!=0){
            num/=10;
            ++count;
        }
        System.out.println("count of digit is "+count);
    }
}
