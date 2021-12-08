package collection;

import java.util.ArrayList;
import java.util.List;

public class TwoArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        iterate(list);

        List<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        iterate(list1 );


    }
       public static void iterate(List<?> list){
        list.forEach(s->{
            System.out.println(s);
        });
        }


    }

