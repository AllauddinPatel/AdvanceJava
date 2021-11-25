package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(2,50);

        System.out.println(list);

        list.forEach(s->{
            System.out.println(s);//For Iterating list
        });

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());//anator method to iterate
        }


        List<Integer>list1= Arrays.asList(10,45,345,435,345,5,56);//way to create array list


        List<Integer>list2=new ArrayList<>(List.of(23,23,23,1324,3456,4567,45));//list creation
        System.out.println(list2);


        List<Integer>list3=new ArrayList<>(){{  //List Creation
            add(12);
            add(21);
            add(65);
        }};
        System.out.println(list3);


        List<Integer>list4=new ArrayList<>(Arrays.asList(1,2312,312,4312,312,312,3123));
        System.out.println(list4);
    }
}



/**
*
 *
 *
 *
 *
* */