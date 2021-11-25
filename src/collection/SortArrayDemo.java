package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortArrayDemo {
    public static void main(String[] args) {


        List<String> list1 = new ArrayList<String>();
        list1.add("Banana");
        list1.add("Grapes");
        list1.add("Carrot");
        list1.add("Apple");

        Collections.sort(list1);
        for (String fruit :list1) {
            System.out.println(fruit);
        }
    }
}
