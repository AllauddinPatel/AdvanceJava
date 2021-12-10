package java8;


//lymda exp is a anonymous function
//it take less code
//give implementation to functional interface

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaExpressionDemo {
    public static void main(String[] args) {
        myinterface myinterface=()-> {
                return "Hello";

        };
        System.out.println(myinterface.msg());

        Myinterface2 myinterface2=(a,b)->{
            return a+b;
        };
        System.out.println(myinterface2.add(3,7));


        List<Integer>lis= Arrays.asList(345345,345,2344,234,235,234,223);

        Consumer<Integer> consumer=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

            }
        };
        lis.forEach(consumer);


    }
}


@FunctionalInterface
interface myinterface{
    String msg();
}

@FunctionalInterface
interface Myinterface2{
    int add(int a,int b);
}