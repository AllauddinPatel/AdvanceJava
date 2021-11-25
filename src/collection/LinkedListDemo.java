package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Linked list store duplicate values
        //linked list maintain insertion order
        //it use Doubly linked list
        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(50);
        list.add(40);

        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.remove(1));
        System.out.println(list.indexOf(40));

        System.out.println(list);
    }
}
