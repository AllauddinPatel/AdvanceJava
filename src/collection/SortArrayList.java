package collection;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Allu");
        list.add("Mayur");
        list.add("Dhaval");

       List<String> list1 = new ArrayList<>();
        list1.add("Anil");
        list1.add("Pankaj");
        list1.add("Rahul");

        list.addAll(list1);
        Collections.sort(list);

        int val=0;
        while (list.size()>val){
            System.out.println(list.get(val));
            val++;
        }




    }
}
