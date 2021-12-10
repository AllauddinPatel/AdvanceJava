package java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class example {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(23,43,46,898,98);
        AtomicInteger j=new AtomicInteger(0);
        for (int i=0;i< list.size();i++){
//            j=j+list.get(i);
//            System.out.println(j);
        }
        list.forEach(s->{
            j.set(j.get()+s);
        });
        System.out.println(j);

    }
}

