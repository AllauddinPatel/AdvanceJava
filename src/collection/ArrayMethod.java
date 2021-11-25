package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(7);
        list1.add(8);

        list.addAll(list1);//add all
//      list.removeAll(list1);//remove similar
    //    list.retainAll(list1);//common value


        System.out.println(list);

        }
    }
