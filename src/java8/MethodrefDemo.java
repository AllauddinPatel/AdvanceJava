package java8;

import java.util.ArrayList;
import java.util.List;

public class MethodrefDemo {
    public static void main(String[] args) {
        //by instance method
        MethodrefDemo obj = new MethodrefDemo() ;
        //refer
        Myinterface3 myinterface3=obj::msg;
        //call
        System.out.println(myinterface3.display());

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.forEach(System.out::println);

    }

    public  String msg(){
        return "Hello";
    };
}


interface Myinterface3{
    String display();
}